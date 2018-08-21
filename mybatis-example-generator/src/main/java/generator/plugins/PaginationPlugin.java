package generator.plugins;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

public class PaginationPlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> list) {
        return true;
    }


    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,IntrospectedTable introspectedTable) {

        // addfield, getter, setter for limit clause

        addLimit(topLevelClass,introspectedTable,"offSet");

        addLimit(topLevelClass,introspectedTable,"pageSize");

        return super.modelExampleClassGenerated(topLevelClass,introspectedTable);

    }



    @Override

    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element,

                                                                   IntrospectedTable introspectedTable) {

        // LIMIT5,10; // 检索记录行 6-15

        XmlElement isNotNullElement= new XmlElement("if");//$NON-NLS-1$

        isNotNullElement.addAttribute(new Attribute("test","offSet != null and pageSize != null and pageSize >= 0"));//$NON-NLS-1$ //$NON-NLS-2$

        isNotNullElement.addElement(new TextElement("limit  ${offSet} , ${pageSize}"));

        element.addElement(isNotNullElement);

        return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element,introspectedTable);

    }
    private void addLimit(TopLevelClass topLevelClass, IntrospectedTable introspectedTable, String name){

        CommentGenerator commentGenerator =context.getCommentGenerator();

        Field field= new Field();

        field.setVisibility(JavaVisibility.PROTECTED);

        field.setType(FullyQualifiedJavaType.getIntInstance());

        field.setName(name);

        field.setInitializationString("-1");

        commentGenerator.addFieldComment(field,introspectedTable);

        topLevelClass.addField(field);

        char c =name.charAt(0);

        String camel= Character.toUpperCase(c) +name.substring(1);

        Method method= new Method();

        method.setVisibility(JavaVisibility.PUBLIC);

        method.setName("set" +camel);

        method.addParameter(new Parameter(FullyQualifiedJavaType.getIntInstance(),name));

        method.addBodyLine("this." +name+ "=" +name+ ";");

        commentGenerator.addGeneralMethodComment(method,introspectedTable);

        topLevelClass.addMethod(method);

        method= new Method();

        method.setVisibility(JavaVisibility.PUBLIC);

        method.setReturnType(FullyQualifiedJavaType.getIntInstance());

        method.setName("get" +camel);

        method.addBodyLine("return " +name+ ";");

        commentGenerator.addGeneralMethodComment(method,introspectedTable);

        topLevelClass.addMethod(method);

    }


}

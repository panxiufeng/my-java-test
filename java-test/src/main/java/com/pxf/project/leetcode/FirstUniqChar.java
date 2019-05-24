/**
 * Software License Declaration.
 * <p>
 * wandaph.com, Co,. Ltd.
 * Copyright ? 2017 All Rights Reserved.
 * <p>
 * Copyright Notice
 * This documents is provided to wandaph contracting agent or authorized programmer only.
 * This source code is written and edited by wandaph Co,.Ltd Inc specially for financial
 * business contracting agent or authorized cooperative company, in order to help them to
 * install, programme or central control in certain project by themselves independently.
 * <p>
 * Disclaimer
 * If this source code is needed by the one neither contracting agent nor authorized programmer
 * during the use of the code, should contact to wandaph Co,. Ltd Inc, and get the confirmation
 * and agreement of three departments managers  - Research Department, Marketing Department and
 * Production Department.Otherwise wandaph will charge the fee according to the programme itself.
 * <p>
 * Any one,including contracting agent and authorized programmer,cannot share this code to
 * the third party without the agreement of wandaph. If Any problem cannot be solved in the
 * procedure of programming should be feedback to wandaph Co,. Ltd Inc in time, Thank you!
 */
package com.pxf.project.leetcode;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author panxiufeng
 * @version Id: FirstUniqChar.java, v 0.1 2019/5/22 9:19 panxiufeng Exp $$
 */
public class FirstUniqChar {

    public static int firstUniqChar(String s) {
        char[] sArr = s.toCharArray();
        Map<Character,Integer> uniqMap = new HashMap<Character,Integer>();
        for(int i=0;i<sArr.length;i++){
            if(uniqMap.containsKey(sArr[i])){
                uniqMap.put(sArr[i],-1);
            }else{
                uniqMap.put(sArr[i],i);
            }
        }

        for(int i=0;i<sArr.length;i++){
            if(uniqMap.get(sArr[i]) != -1){
                return uniqMap.get(sArr[i]);
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        Date d = new Date();
        
        System.out.println(firstUniqChar ("aadadaad"));
        System.out.println("----->"+(new Date().getTime()-d.getTime()));
    }
}
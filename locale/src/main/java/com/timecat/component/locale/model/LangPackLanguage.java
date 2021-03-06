package com.timecat.component.locale.model;

/**
 * @author 林学渊
 * @email linxy59@mail2.sysu.edu.cn
 * @date 2020/10/23
 * @description 语言包
 * @usage null
 */
public class LangPackLanguage {
    /**
     * 官方的语言包
     * true：是官方的
     * false：不是官方的
     */
    public boolean official = false;
    /**
     * rtl = right to left
     */
    public boolean rtl = false;
    /**
     * 英语名
     * 这是通用的名字，给机器看的，用作id
     */
    public String name = "";
    /**
     * 本地名
     * 给人看的
     */
    public String native_name = "";
    /**
     * 语言名字，给 android 看
     * zh en fr ja
     */
    public String lang_code = "";
    public String base_lang_code = "";
    public String plural_code = "";
}

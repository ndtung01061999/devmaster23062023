package com.vn.devmaster.demo.accessmodifier.modifierparent;

import com.vn.devmaster.demo.accessmodifier.modifier.ModifierClass;

public class ModifierClassParent extends ModifierClass {

    public static void main(String[] args) {
        ModifierClassParent modifierClassParent = new ModifierClassParent();
        modifierClassParent.messageProtected();
    }
}

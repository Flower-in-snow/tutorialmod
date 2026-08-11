package com.example.tutorialmod.item;

import com.example.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
//    下面代码的意思是创造了一个全局物品引入方法，他的名字是registeredItems，返回类型是Item,这样方便赋值后变量调取，后面是两个形参
//    后面想引用只需ModItems.registeredItems()
    private static Item registeredItems(String id, Item item){
//        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(TutorialMod.MOD_ID, id)), item)
//        查看Items类代码我们发现，注册物品的本质是用Registry类里的register方法
//        上述这样写也可以，但是我们查看Registry类里的register方法，发现register方法可以简化
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, id), item);
    }
    public static final Item ICE_SPRAY_WAND = registeredItems("ice_spray_wand", new SwordItem(ToolMaterials.WOOD, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD, 20,-1.0F))));
//  创造新物品
    public static void registeredModItems(){
        TutorialMod.LOGGER.info("Registering Items");
    }
//    上面是一段无意义的代码，本质是为了初始化调用
}

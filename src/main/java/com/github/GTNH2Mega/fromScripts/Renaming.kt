package com.github.GTNH2Mega.fromScripts

import java.lang.Runnable
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.tooltip.IngredientTooltips
import minetweaker.MineTweakerAPI
import minetweaker.expand.ExpandString
import minetweaker.api.item.IItemStack
import minetweaker.api.data.IData
import minetweaker.expand.ExpandInt
import minetweaker.expand.ExpandAnyDict
import java.util.HashMap

class Renaming : Runnable {
    override fun run() {
        ItemBracketHandler.getItem("minecraft:ender_chest", 0).displayName = "Personal Ender Chest"
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("minecraft:ender_chest", 0), MineTweakerAPI.format.darkAqua(ExpandString.asFormattedText("Only For Personal Use")))
        ItemBracketHandler.getItem("StevesCarts:CartModule", 61).displayName = "Infinity Engine"
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("StevesCarts:CartModule", 61), MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("Perpetual Locomotion")))
        ItemBracketHandler.getItem("StevesCarts:upgrade", 14).displayName = "Upgrade: Integrated Infinity Reactor"
        ItemBracketHandler.getItem("StevesCarts:CartModule", 76).displayName = "Quantum Minecart Hull"
        ItemBracketHandler.getItem("StevesCarts:CartModule", 81).displayName = "Galgadorian Minecart Hull"
        ItemBracketHandler.getItem("StevesCarts:CartModule", 39).displayName = "Reinforced Minecart Hull"
        ItemBracketHandler.getItem("StevesCarts:CartModule", 38).displayName = "Standard Minecart Hull"
        ItemBracketHandler.getItem("StevesCarts:CartModule", 37).displayName = "Wooden Minecart Hull"
        ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCreativeEnergyCell", 0).displayName = "Neutronium Energy Cell"
        IngredientTooltips.addTooltip(ItemBracketHandler.getItem("appliedenergistics2:tile.BlockCreativeEnergyCell", 0), MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("Infinite Energy")))
        val iItemStack = ItemBracketHandler.getItem("EnderIO:blockCapBank", 0)
        val hashMap = HashMap<String, IData>()
        hashMap["type"] = ExpandString.asData("CREATIVE")
        hashMap["storedEnergyRF"] = ExpandInt.toData(2500000)
        iItemStack.withTag(ExpandAnyDict.asData(hashMap)).displayName = "Chaotic Capacitor Bank"
        val iItemStack2 = ItemBracketHandler.getItem("EnderIO:blockCapBank", 0)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["type"] = ExpandString.asData("CREATIVE")
        hashMap2["storedEnergyRF"] = ExpandInt.toData(2500000)
        IngredientTooltips.addTooltip(iItemStack2.withTag(ExpandAnyDict.asData(hashMap2)), MineTweakerAPI.format.lightPurple(ExpandString.asFormattedText("Infinite Energy")))
    }
}
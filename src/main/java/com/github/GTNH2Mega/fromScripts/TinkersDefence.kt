package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels.MV
import java.lang.Runnable
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import gttweaker.mods.gregtech.machines.Extruder
import minetweaker.mods.ic2.machines.Compressor
import modtweaker2.mods.tconstruct.handlers.Casting

class TinkersDefence : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("tinkersdefense:AeonSteelIngot", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("tinkersdefense:AeonSteelBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("tinkersdefense:QueensGoldIngot", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("tinkersdefense:QueensGoldBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("tinkersdefense:DogbeariumIngot", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("tinkersdefense:DogbeariumBlock", 0))
        Casting.removeTableRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 201), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 203), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 202), null, null)
        Compressor.addRecipe(ItemBracketHandler.getItem("tinkersdefense:AeonSteelBlock", 0), ItemBracketHandler.getItem("tinkersdefense:AeonSteelIngot", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("tinkersdefense:QueensGoldBlock", 0), ItemBracketHandler.getItem("tinkersdefense:QueensGoldIngot", 0).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("tinkersdefense:DogbeariumBlock", 0), ItemBracketHandler.getItem("tinkersdefense:DogbeariumIngot", 0).amount(9))
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 201), ItemBracketHandler.getItem("tinkersdefense:AeonSteelIngot", 0), ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 1760, MV)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 203), ItemBracketHandler.getItem("tinkersdefense:DogbeariumIngot", 0), ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 1280, MV)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 202), ItemBracketHandler.getItem("tinkersdefense:QueensGoldIngot", 0), ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 200, MV)
    }
}
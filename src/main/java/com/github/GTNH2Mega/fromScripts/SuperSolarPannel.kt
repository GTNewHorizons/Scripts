package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels.IV
import java.lang.Runnable
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.OreBracketHandler
import gttweaker.mods.gregtech.machines.PrecisionLaser

class SuperSolarPannel : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32756), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolCrowbar"), ItemBracketHandler.getItem("supersolarpanel:SpectralSolarPanel", 0), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32757), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolCrowbar"), ItemBracketHandler.getItem("supersolarpanel:SingularSolarPanel", 0), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32758), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolCrowbar"), ItemBracketHandler.getItem("supersolarpanel:AdminSolarPanel", 0), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32759), arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolCrowbar"), ItemBracketHandler.getItem("supersolarpanel:PhotonicSolarPanel", 0), OreBracketHandler.getOre("craftingToolScrewdriver")), arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolWrench"), OreBracketHandler.getOre("craftingToolHardHammer"), OreBracketHandler.getOre("craftingToolFile"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("supersolarpanel:solarsplitter", 0), arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("supersolarpanel:redcomponent", 0), ItemBracketHandler.getItem("supersolarpanel:greencomponent", 0), ItemBracketHandler.getItem("supersolarpanel:bluecomponent", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("supersolarpanel:redcomponent", 0), ItemBracketHandler.getItem("supersolarpanel:greencomponent", 0), ItemBracketHandler.getItem("supersolarpanel:bluecomponent", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("supersolarpanel:redcomponent", 0), ItemBracketHandler.getItem("supersolarpanel:greencomponent", 0), ItemBracketHandler.getItem("supersolarpanel:bluecomponent", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("supersolarpanel:enderquantumcomponent", 0), arrayOf(arrayOf(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 3), OreBracketHandler.getOre("plateElectrumFlux"), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 3)), arrayOf<IIngredient>(OreBracketHandler.getOre("plateElectrumFlux"), OreBracketHandler.getOre("plateDenseInfinityCatalyst"), OreBracketHandler.getOre("plateElectrumFlux")), arrayOf(ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 3), OreBracketHandler.getOre("plateElectrumFlux"), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 3))), null)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:greencomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24501).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:greencomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24504).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:greencomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24505).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:greencomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24542).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:bluecomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24503).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:bluecomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24510).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:bluecomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24513).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:bluecomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24543).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:redcomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24347).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:redcomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24511).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:redcomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24512).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:redcomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24502).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:redcomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24527).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
        PrecisionLaser.addRecipe(ItemBracketHandler.getItem("supersolarpanel:redcomponent", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 24541).amount(0), ItemBracketHandler.getItem("AdvancedSolarPanel:asp_crafting_items", 5), 1000, IV)
    }
}
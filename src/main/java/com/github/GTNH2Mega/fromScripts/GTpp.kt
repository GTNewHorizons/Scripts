package com.github.GTNH2Mega.fromScripts

import com.github.GTNH2Mega.VoltageLevels.IV
import java.lang.Runnable
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.OreBracketHandler
import modtweaker2.mods.forestry.handlers.Carpenter
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.api.item.IItemStack
import gttweaker.mods.gregtech.machines.Assembler

class GTpp : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 875))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("miscutils:frameAccelerated", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("miscutils:frameMutagenic", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("miscutils:frameBusy", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("miscutils:frameDecaying", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("miscutils:frameSlowing", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("miscutils:frameStabilizing", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("miscutils:frameArborists", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("miscutils:personalCloakingDevice-0.0", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32596))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32618))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32638))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32648))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32658))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32688))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32698))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32678))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 946))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 947))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 948))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 949))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 950))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 798))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 875), arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("RIO:tile.machine", 1), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 363), ItemBracketHandler.getItem("RIO:tile.machine", 1)), arrayOf<IIngredient>(OreBracketHandler.getOre("gearGtTungstenSteel"), OreBracketHandler.getOre("circuitElite"), OreBracketHandler.getOre("gearGtTungstenSteel")), arrayOf<IIngredient>(ItemBracketHandler.getItem("RIO:tile.machine", 1), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 363), ItemBracketHandler.getItem("RIO:tile.machine", 1))), null)
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22303), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23303), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22303), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23303), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29303), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23303), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22303), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23303), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22303)), ItemBracketHandler.getItem("Forestry:frameImpregnated", 0), ItemBracketHandler.getItem("miscutils:frameAccelerated", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22097), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23101), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22097), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23101), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29101), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23101), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22097), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23101), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22097)), ItemBracketHandler.getItem("Forestry:frameImpregnated", 0), ItemBracketHandler.getItem("miscutils:frameMutagenic", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22349), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23349), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22349), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23349), ItemBracketHandler.getItem("minecraft:nether_star", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23349), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22349), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23349), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22349)), ItemBracketHandler.getItem("Forestry:frameImpregnated", 0), ItemBracketHandler.getItem("miscutils:frameBusy", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22304), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23304), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22304), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23304), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29304), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23304), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22304), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23304), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22304)), ItemBracketHandler.getItem("Forestry:frameImpregnated", 0), ItemBracketHandler.getItem("miscutils:frameDecaying", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), arrayOf(ItemBracketHandler.getItem("miscutils:itemRodLongTumbaga", 0), ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0), ItemBracketHandler.getItem("miscutils:itemRodLongTumbaga", 0), ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29303), ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0), ItemBracketHandler.getItem("miscutils:itemRodLongTumbaga", 0), ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0), ItemBracketHandler.getItem("miscutils:itemRodLongTumbaga", 0)), ItemBracketHandler.getItem("Forestry:frameImpregnated", 0), ItemBracketHandler.getItem("miscutils:frameSlowing", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22317), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23317), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22317), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23317), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 29317), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23317), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22317), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23317), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22317)), ItemBracketHandler.getItem("Forestry:frameImpregnated", 0), ItemBracketHandler.getItem("miscutils:frameStabilizing", 0))
        Carpenter.addRecipe(60, LiquidBracketHandler.getLiquid("molten.redstone").withAmount(576), arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22889), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23889), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22889), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23889), ItemBracketHandler.getItem("minecraft:paper", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23889), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22889), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23889), ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 22889)), ItemBracketHandler.getItem("Forestry:frameImpregnated", 0), ItemBracketHandler.getItem("miscutils:frameArborists", 0))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("dreamcraft:item.CoinBeesI", 0).amount(16), arrayOf<IIngredient>(ItemBracketHandler.getItem("miscutils:frameUseless", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("miscutils:blockFrameGtTumbaga", 0).amount(2), arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0), ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0), ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0)), arrayOf(ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0), OreBracketHandler.getOre("craftingToolWrench"), ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0), ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0), ItemBracketHandler.getItem("miscutils:itemRodTumbaga", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.blockmachines", 798), arrayOf(arrayOf(OreBracketHandler.getOre("plateBlueSteel"), ItemBracketHandler.getItem("gregtech:gt.blockcasings", 5), OreBracketHandler.getOre("plateBlueSteel")), arrayOf(OreBracketHandler.getOre("circuitElite"), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 355), OreBracketHandler.getOre("circuitElite")), arrayOf(OreBracketHandler.getOre("plateBlueSteel"), ItemBracketHandler.getItem("gregtech:gt.blockcasings", 5), OreBracketHandler.getOre("plateBlueSteel"))), null)
        Assembler.addRecipe(ItemBracketHandler.getItem("miscutils:personalCloakingDevice-0.0", 0), ItemBracketHandler.getItem("IC2:itemPartIridium", 0).amount(4), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32597), LiquidBracketHandler.getLiquid("molten.nichrome").withAmount(1440), 2400, IV)
    }
}
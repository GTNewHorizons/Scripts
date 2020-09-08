package com.github.GTNH2Mega.fromScripts

import gttweaker.mods.gregtech.machines.*
import minetweaker.MineTweakerAPI
import minetweaker.api.data.IData
import minetweaker.api.item.IIngredient
import minetweaker.api.item.IngredientTransform
import minetweaker.api.tooltip.IngredientTooltips
import minetweaker.expand.*
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.LiquidBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler
import minetweaker.mods.ic2.machines.Compressor
import minetweaker.mods.ic2.machines.Extractor
import modtweaker2.mods.tconstruct.handlers.Casting
import modtweaker2.mods.tconstruct.handlers.Drying
import modtweaker2.mods.tconstruct.handlers.Smeltery
import java.util.*

class TinkersConstruct : Runnable {
    override fun run() {
        val item = ItemBracketHandler.getItem("TConstruct:oreBerries", 0)
        val item2 = ItemBracketHandler.getItem("TConstruct:oreBerries", 1)
        val item3 = ItemBracketHandler.getItem("TConstruct:oreBerries", 2)
        val item4 = ItemBracketHandler.getItem("TConstruct:oreBerries", 3)
        val item5 = ItemBracketHandler.getItem("TConstruct:oreBerries", 4)
        val item6 = ItemBracketHandler.getItem("TConstruct:oreBerries", 5)
        ItemBracketHandler.getItem("TConstruct:SearedBlock", 2)
        val item7 = ItemBracketHandler.getItem("minecraft:string", 0)
        val item8 = ItemBracketHandler.getItem("TConstruct:materials", 25)
        val item9 = ItemBracketHandler.getItem("TConstruct:materials", 26)
        val item10 = ItemBracketHandler.getItem("TConstruct:materials", 6)
        val item11 = ItemBracketHandler.getItem("TConstruct:MetalBlock", 10)
        val ore = OreBracketHandler.getOre("torchStone")
        val item12 = ItemBracketHandler.getItem("TConstruct:heartCanister", 0)
        OreBracketHandler.getOre("plateAluminium")
        OreBracketHandler.getOre("stickAluminium")
        ItemBracketHandler.getItem("TConstruct:GlassPane", 0)
        ItemBracketHandler.getItem("TwilightForest:tile.TFPlant", 3)
        ItemBracketHandler.getItem("BiomesOPlenty:moss", 0)
        ItemBracketHandler.getItem("minecraft:stonebrick", 1)
        val item13 = ItemBracketHandler.getItem("TConstruct:CraftedSoil", 1)
        val item14 = ItemBracketHandler.getItem("minecraft:gravel", 0)
        val ore2 = OreBracketHandler.getOre("sand")
        ItemBracketHandler.getItem("minecraft:clay_ball", 0)
        val item15 = ItemBracketHandler.getItem("minecraft:slime_ball", 0)
        val item16 = ItemBracketHandler.getItem("TConstruct:strangeFood", 0)
        val item17 = ItemBracketHandler.getItem("minecraft:chest", 0)
        val item18 = ItemBracketHandler.getItem("TConstruct:GlassBlock", 0)
        val item19 = ItemBracketHandler.getItem("TConstruct:GlassPane", 0)
        val ore3 = OreBracketHandler.getOre("dustClay")
        val ore4 = OreBracketHandler.getOre("dyeWhite")
        val ore5 = OreBracketHandler.getOre("dyeOrange")
        val ore6 = OreBracketHandler.getOre("dyeMagenta")
        val ore7 = OreBracketHandler.getOre("dyeLightBlue")
        val ore8 = OreBracketHandler.getOre("dyeYellow")
        val ore9 = OreBracketHandler.getOre("dyeLime")
        val ore10 = OreBracketHandler.getOre("dyePink")
        val ore11 = OreBracketHandler.getOre("dyeGray")
        val ore12 = OreBracketHandler.getOre("dyeLightGray")
        val ore13 = OreBracketHandler.getOre("dyeCyan")
        val ore14 = OreBracketHandler.getOre("dyePurple")
        val ore15 = OreBracketHandler.getOre("dyeBlue")
        val ore16 = OreBracketHandler.getOre("dyeBrown")
        val ore17 = OreBracketHandler.getOre("dyeGreen")
        val ore18 = OreBracketHandler.getOre("dyeRed")
        val ore19 = OreBracketHandler.getOre("dyeBlack")
        val item20 = ItemBracketHandler.getItem("TConstruct:knapsack", 0)
        val item21 = ItemBracketHandler.getItem("TConstruct:travelBelt", 0)
        val item22 = ItemBracketHandler.getItem("TConstruct:travelBoots", 0)
        val item23 = ItemBracketHandler.getItem("TConstruct:travelGlove", 0)
        val item24 = ItemBracketHandler.getItem("TConstruct:travelGoggles", 0)
        val item25 = ItemBracketHandler.getItem("TConstruct:travelVest", 0)
        val item26 = ItemBracketHandler.getItem("TConstruct:travelWings", 0)
        OreBracketHandler.getOre("craftingToolHardHammer")
        OreBracketHandler.getOre("craftingToolFile")
        val ore20 = OreBracketHandler.getOre("craftingToolShears")
        val item27 = ItemBracketHandler.getItem("ExtraUtilities:paintbrush", 0)
        IngredientTooltips.addTooltip(item, ExpandString.asFormattedText("Can be placed on a empty IC2 Crop."))
        IngredientTooltips.addTooltip(item4, ExpandString.asFormattedText("Can be placed on a empty IC2 Crop."))
        IngredientTooltips.addTooltip(item3, ExpandString.asFormattedText("Can be placed on a empty IC2 Crop."))
        IngredientTooltips.addTooltip(item2, ExpandString.asFormattedText("Can be placed on a empty IC2 Crop."))
        IngredientTooltips.addTooltip(item5, ExpandString.asFormattedText("Can be placed on a empty IC2 Crop."))
        IngredientTooltips.addTooltip(item6, ExpandString.asFormattedText("Can be placed on a empty IC2 Crop."))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("minecraft:iron_block", 0), null, null)
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("minecraft:gold_block", 0), null, null)
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("minecraft:obsidian", 0), null, null)
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("minecraft:emerald_block", 0), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MetalBlock", 0))
        Smeltery.removeMelting(ItemBracketHandler.getItem("TConstruct:MetalBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MetalBlock", 1))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("TConstruct:MetalBlock", 1), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MetalBlock", 2))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("TConstruct:MetalBlock", 2), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MetalBlock", 3))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("IC2:blockMetal", 0), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MetalBlock", 4))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("IC2:blockMetal", 2), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MetalBlock", 5))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("IC2:blockMetal", 1), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MetalBlock", 6))
        Casting.removeBasinRecipe(OreBracketHandler.getOre("blockAluminum"), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("TConstruct:MetalBlock", 7), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MetalBlock", 8))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("TConstruct:MetalBlock", 8), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MetalBlock", 9))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("TConstruct:GlueBlock", 0), null, null)
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("gregtech:gt.blockmetal5", 11), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:slime.gel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:slime.gel", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:LavaTank", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:LavaTankNether", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Smeltery", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPane", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:helmetWood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:chestplateWood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:leggingsWood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:bootsWood", 0))
        Casting.removeTableRecipe(ItemBracketHandler.getItem("TConstruct:materials", 2), null, null)
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("TConstruct:Smeltery", 4), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Smeltery", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Smeltery", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Smeltery", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Smeltery", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedBlock", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedBlock", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedBlock", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedBlock", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedBlock", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickfancy", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickfancy", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickfancy", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickfancy", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickfancy", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickfancy", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickfancy", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickfancy", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickfancy", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickfancy", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickmetal", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickmetal", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickmetal", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.multibrickmetal", 7))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("TConstruct:Smeltery", 5), null, null)
        Casting.removeBasinRecipe(item11, null, null)
        Smeltery.removeMelting(OreBracketHandler.getOre("oreCobalt"))
        Smeltery.removeMelting(OreBracketHandler.getOre("dustCobalt"))
        Smeltery.removeMelting(OreBracketHandler.getOre("oreArdite"))
        Smeltery.removeMelting(OreBracketHandler.getOre("dustArdite"))
        Smeltery.removeMelting(OreBracketHandler.getOre("nuggetArdite"))
        Smeltery.removeMelting(OreBracketHandler.getOre("blockArdite"))
        Smeltery.removeMelting(OreBracketHandler.getOre("dustManyullyn"))
        Smeltery.removeMelting(OreBracketHandler.getOre("nuggetManyullyn"))
        Smeltery.removeMelting(OreBracketHandler.getOre("blockManyullyn"))
        Smeltery.removeMelting(OreBracketHandler.getOre("blockEnder"))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 11))
        Casting.removeTableRecipe(ItemBracketHandler.getItem("BuildCraft|Core:ironGearItem", 0), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("BuildCraft|Core:goldGearItem", 0), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("Forestry:gearBronze", 0), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("Forestry:gearCopper", 0), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("Forestry:gearTin", 0), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31085), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31034), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31054), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31303), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31302), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31089), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31305), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("IC2:itemIngot", 0), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("IC2:itemIngot", 1), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("IC2:itemIngot", 2), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("IC2:itemIngot", 3), null, null)
        Smeltery.removeMelting(ItemBracketHandler.getItem("minecraft:chainmail_helmet", 0))
        Smeltery.removeMelting(ItemBracketHandler.getItem("minecraft:chainmail_chestplate", 0))
        Smeltery.removeMelting(ItemBracketHandler.getItem("minecraft:chainmail_leggings", 0))
        Smeltery.removeMelting(ItemBracketHandler.getItem("minecraft:chainmail_boots", 0))
        Smeltery.removeMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9033))
        Smeltery.removeMelting(OreBracketHandler.getOre("ingotCobalt"))
        Smeltery.removeMelting(ItemBracketHandler.getItem("gregtech:gt.blockmetal2", 5))
        Casting.removeBasinRecipe(OreBracketHandler.getOre("blockCobalt"), null, null)
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron_block", 0), null, null)
        Smeltery.removeMelting(ItemBracketHandler.getItem("minecraft:sand", 0))
        Smeltery.removeAlloy(LiquidBracketHandler.getLiquid("alumite.molten"))
        MineTweakerAPI.furnace.remove(OreBracketHandler.getOre("ingotObsidian"), null)
        MineTweakerAPI.recipes.remove(item12)
        MineTweakerAPI.recipes.remove(ore)
        MineTweakerAPI.recipes.remove(item8)
        MineTweakerAPI.recipes.remove(item9)
        MineTweakerAPI.recipes.remove(item10)
        MineTweakerAPI.recipes.remove(item13)
        Smeltery.removeMelting(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:toolRod", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:blankPattern", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:decoration.stoneladder", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:trap.punji", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 22))
        Casting.removeTableRecipe(ItemBracketHandler.getItem("minecraft:golden_apple", 0), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("TConstruct:gearCast", 0), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31321), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31382), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.02", 31386), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:MeatBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:WoolSlab1", 32767))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:WoolSlab2", 32767))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedSlab", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedSlab", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedSlab", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedSlab", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedSlab", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedSlab", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedSlab", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedSlab", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Smeltery", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Smeltery", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedBlockNether", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedBlock", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedBlockNether", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CastingChannel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedBlock", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SearedBlockNether", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:LavaTank", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:LavaTankNether", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:LavaTank", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:LavaTankNether", 2))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotTin"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetTin"),
                        OreBracketHandler.getOre("nuggetTin"), OreBracketHandler.getOre("nuggetTin")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetTin"),
                                OreBracketHandler.getOre("nuggetTin"), OreBracketHandler.getOre("nuggetTin")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetTin"),
                                OreBracketHandler.getOre("nuggetTin"), OreBracketHandler.getOre("nuggetTin"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotCopper"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetCopper"),
                        OreBracketHandler.getOre("nuggetCopper"), OreBracketHandler.getOre("nuggetCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetCopper"),
                                OreBracketHandler.getOre("nuggetCopper"), OreBracketHandler.getOre("nuggetCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetCopper"),
                                OreBracketHandler.getOre("nuggetCopper"), OreBracketHandler.getOre("nuggetCopper"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotSteel"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetSteel"),
                        OreBracketHandler.getOre("nuggetSteel"), OreBracketHandler.getOre("nuggetSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetSteel"),
                                OreBracketHandler.getOre("nuggetSteel"), OreBracketHandler.getOre("nuggetSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetSteel"),
                                OreBracketHandler.getOre("nuggetSteel"), OreBracketHandler.getOre("nuggetSteel"))))
        MineTweakerAPI.recipes.removeShaped(OreBracketHandler.getOre("ingotBronze"),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetBronze"),
                        OreBracketHandler.getOre("nuggetBronze"), OreBracketHandler.getOre("nuggetBronze")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetBronze"),
                                OreBracketHandler.getOre("nuggetBronze"), OreBracketHandler.getOre("nuggetBronze")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("nuggetBronze"),
                                OreBracketHandler.getOre("nuggetBronze"), OreBracketHandler.getOre("nuggetBronze"))))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("IC2:itemRubber", 0), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 14))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 41))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 42))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 20))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 21))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 31))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 24))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 32))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 27))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 28))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 29))
        Casting.removeTableRecipe(OreBracketHandler.getOre("nuggetArdite"), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 30))
        Casting.removeTableRecipe(OreBracketHandler.getOre("nuggetManyullyn"), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 16))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 12))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 13))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 14))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 15))
        MineTweakerAPI.recipes.remove(item20)
        MineTweakerAPI.recipes.remove(item24)
        MineTweakerAPI.recipes.remove(item25)
        MineTweakerAPI.recipes.remove(item23)
        MineTweakerAPI.recipes.remove(item26)
        MineTweakerAPI.recipes.remove(item21)
        MineTweakerAPI.recipes.remove(item22)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:trap.barricade.oak", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:trap.barricade.spruce", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:trap.barricade.birch", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:trap.barricade.jungle", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:explosive.slime", 32767))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:slime.channel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:blood.channel", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:slime.pad", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:rail.wood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftingStation", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 32767))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 32767))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:FurnaceSlab", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:strangeFood", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:goldHead", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Armor.DryingRack", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("TConstruct:materials", 1), null)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("TConstruct:materials", 17), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 3))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("TConstruct:materials", 3), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 4))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("TConstruct:materials", 4), null)
        Casting.removeTableRecipe(OreBracketHandler.getOre("ingotArdite"), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 5))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("TConstruct:materials", 5), null)
        Casting.removeTableRecipe(OreBracketHandler.getOre("ingotManyullyn"), null, null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 14))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("TConstruct:materials", 14), null)
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 15))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 18))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:diamondApple", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:heartCanister", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:heartCanister", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:heartCanister", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:materials", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Redstone.Landmine", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Redstone.Landmine", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Redstone.Landmine", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("TConstruct:Redstone.Landmine", 3))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("TConstruct:materials", 11), null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("TConstruct:materials", 11), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("TConstruct:materials", 22), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 0), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 2), null, null)
        Casting.removeTableRecipe(ItemBracketHandler.getItem("Thaumcraft:ItemNugget", 1), null, null)
        Smeltery.removeMelting(ItemBracketHandler.getItem("minecraft:snowball", 0))
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("TConstruct:materials", 2), null)
        MineTweakerAPI.furnace.remove(ItemBracketHandler.getItem("TConstruct:materials", 37), null)
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11019),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 22),
                        ItemBracketHandler.getItem("TConstruct:materials", 22),
                        ItemBracketHandler.getItem("TConstruct:materials", 22)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 22),
                                ItemBracketHandler.getItem("TConstruct:materials", 22),
                                ItemBracketHandler.getItem("TConstruct:materials", 22)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 22),
                                ItemBracketHandler.getItem("TConstruct:materials", 22),
                                ItemBracketHandler.getItem("TConstruct:materials", 22))))
        MineTweakerAPI.recipes.removeShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11019),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 12), null, null)))
        Smeltery.removeMelting(ItemBracketHandler.getItem("ExtraUtilities:cobblestone_compressed", 14))
        Smeltery.removeMelting(ItemBracketHandler.getItem("ExtraUtilities:cobblestone_compressed", 15))
        Casting.removeBasinRecipe(ItemBracketHandler.getItem("IC2:blockMetal", 5), null, null)
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2019),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(144), 500,
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1585))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11019),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(144), 500,
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1585))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 19),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(16), 500,
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1585))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 1019),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(36), 500,
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1585))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2890),
                LiquidBracketHandler.getLiquid("glass.molten").withAmount(1000), 800,
                ItemBracketHandler.getItem("minecraft:sand", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:oreBerries", 4),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(16), 500,
                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 1585))
        Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9035),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(16),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 27), false, 20)
        Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9057),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(16),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 27), false, 20)
        Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9032),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(16),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 27), false, 20)
        Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9300),
                LiquidBracketHandler.getLiquid("bronze.molten").withAmount(16),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 27), false, 20)
        Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 0), false, 100)
        Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11057),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(144),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 0), false, 100)
        Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                LiquidBracketHandler.getLiquid("bronze.molten").withAmount(144),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 0), false, 100)
        Casting.addTableRecipe(ItemBracketHandler.getItem("TConstruct:materials", 14),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(144),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 0), false, 100)
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 0),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 1),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 2),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 3),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 4),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 5),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 6),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 7),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 8),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 9),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 10),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 11),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 12),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 13),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 14),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 15),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 16),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 17),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 18),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 19),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 20),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 21),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 22),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 25),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 26),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:metalPattern", 27),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:Cast", 0),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:Cast", 1),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:Cast", 2),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:Cast", 3),
                LiquidBracketHandler.getLiquid("aluminumbrass.molten").withAmount(72), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 32),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1032),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2032),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3032),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4032),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 930),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1930),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2930),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3930),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4930),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 931),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1931),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2931),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3931),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4931),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 917),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1917),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2917),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3917),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4917),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 936),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1936),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2936),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3936),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4936),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 870),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1870),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 28706),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3870),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4870),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 834),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1834),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2834),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3834),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4834),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(144), 700,
                ItemBracketHandler.getItem("minecraft:iron_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 35),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1035),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2035),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3035),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4035),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 871),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1871),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2871),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3871),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4871),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 840),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1840),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2840),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3840),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4840),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 855),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1855),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2855),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3855),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4855),
                LiquidBracketHandler.getLiquid("copper.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 3))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 57),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1057),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2057),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3057),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4057),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 824),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(288), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1824),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(288), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2824),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(288), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3824),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(288), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4824),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 937),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(288), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1937),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(288), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2937),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(288), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3937),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(288), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4937),
                LiquidBracketHandler.getLiquid("tin.molten").withAmount(288), 600,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 86),
                LiquidBracketHandler.getLiquid("gold.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("minecraft:gold_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1086),
                LiquidBracketHandler.getLiquid("gold.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("minecraft:gold_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2086),
                LiquidBracketHandler.getLiquid("gold.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("minecraft:gold_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3086),
                LiquidBracketHandler.getLiquid("gold.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("minecraft:gold_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4086),
                LiquidBracketHandler.getLiquid("gold.molten").withAmount(144), 600,
                ItemBracketHandler.getItem("minecraft:gold_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 19),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1019),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2019),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3019),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4019),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 34),
                LiquidBracketHandler.getLiquid("nickel.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 34))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1034),
                LiquidBracketHandler.getLiquid("nickel.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 34))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2034),
                LiquidBracketHandler.getLiquid("nickel.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 34))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3034),
                LiquidBracketHandler.getLiquid("nickel.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 34))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4034),
                LiquidBracketHandler.getLiquid("nickel.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 34))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 89),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 89))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1089),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 89))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2089),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 89))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3089),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 89))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4089),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 89))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 54),
                LiquidBracketHandler.getLiquid("silver.molten").withAmount(144), 500,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 54))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1054),
                LiquidBracketHandler.getLiquid("silver.molten").withAmount(144), 500,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 54))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2054),
                LiquidBracketHandler.getLiquid("silver.molten").withAmount(144), 500,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 54))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3054),
                LiquidBracketHandler.getLiquid("silver.molten").withAmount(144), 500,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 54))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4054),
                LiquidBracketHandler.getLiquid("silver.molten").withAmount(144), 500,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 54))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 85),
                LiquidBracketHandler.getLiquid("platinum.molten").withAmount(144), 800,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 85))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1085),
                LiquidBracketHandler.getLiquid("platinum.molten").withAmount(144), 800,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 85))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2085),
                LiquidBracketHandler.getLiquid("platinum.molten").withAmount(144), 800,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 85))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3085),
                LiquidBracketHandler.getLiquid("platinum.molten").withAmount(144), 800,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 85))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4085),
                LiquidBracketHandler.getLiquid("platinum.molten").withAmount(144), 800,
                ItemBracketHandler.getItem("gregtech:gt.blockores", 85))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 501),
                LiquidBracketHandler.getLiquid("emerald.liquid").withAmount(640), 800,
                ItemBracketHandler.getItem("minecraft:emerald_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 1501),
                LiquidBracketHandler.getLiquid("emerald.liquid").withAmount(640), 800,
                ItemBracketHandler.getItem("minecraft:emerald_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 2501),
                LiquidBracketHandler.getLiquid("emerald.liquid").withAmount(640), 800,
                ItemBracketHandler.getItem("minecraft:emerald_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 3501),
                LiquidBracketHandler.getLiquid("emerald.liquid").withAmount(640), 800,
                ItemBracketHandler.getItem("minecraft:emerald_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.blockores", 4501),
                LiquidBracketHandler.getLiquid("emerald.liquid").withAmount(640), 800,
                ItemBracketHandler.getItem("minecraft:emerald_ore", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32300),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32301),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32302),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32303),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32304),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32305),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32308),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32309),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32310),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32311),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32312),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32313),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32314),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32315),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32316),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32317),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32318),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32319),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32320),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32321),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32322),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32323),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32350),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32351),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32352),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32353),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32354),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32355),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32356),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32357),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32358),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32359),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32360),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32361),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32362),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32363),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32364),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32365),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32366),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32367),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32368),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32369),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32370),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32371),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32372),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32373),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.ExtruderShapeBoat", 0),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576), 800,
                ItemBracketHandler.getItem("IC2:blockMetal", 5))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2880),
                LiquidBracketHandler.getLiquid("glue").withAmount(144), 250,
                ItemBracketHandler.getItem("TConstruct:GlueBlock", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11880),
                LiquidBracketHandler.getLiquid("glue").withAmount(144), 300,
                ItemBracketHandler.getItem("TConstruct:GlueBlock", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17880),
                LiquidBracketHandler.getLiquid("glue").withAmount(288), 350,
                ItemBracketHandler.getItem("TConstruct:GlueBlock", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("EMT:EMTItems", 10),
                LiquidBracketHandler.getLiquid("glue").withAmount(576), 400,
                ItemBracketHandler.getItem("TConstruct:GlueBlock", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("EMT:EMTItems", 8),
                LiquidBracketHandler.getLiquid("glue").withAmount(288), 200,
                ItemBracketHandler.getItem("TConstruct:GlueBlock", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                LiquidBracketHandler.getLiquid("cobalt.molten").withAmount(144), 650,
                ItemBracketHandler.getItem("TConstruct:GravelOre", 5))
        Casting.addTableRecipe(ItemBracketHandler.getItem("TConstruct:materials", 12),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(144),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 0), false, 200)
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:materials", 12),
                LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(144), 500,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 6))
        Casting.addTableRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(144),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 0), false, 800)
        Casting.addBasinRecipe(ItemBracketHandler.getItem("TConstruct:Smeltery", 4),
                LiquidBracketHandler.getLiquid("stone.seared").withAmount(360), null, false, 245)
        Casting.addBasinRecipe(ItemBracketHandler.getItem("TConstruct:Smeltery", 5),
                LiquidBracketHandler.getLiquid("stone.seared").withAmount(360),
                ItemBracketHandler.getItem("minecraft:cobblestone", 0), false, 245)
        Smeltery.addMelting(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 0),
                LiquidBracketHandler.getLiquid("obsidian.molten").withAmount(288), 850,
                ItemBracketHandler.getItem("minecraft:obsidian", 0))
        Smeltery.addMelting(ItemBracketHandler.getItem("Thaumcraft:blockCosmeticSolid", 1),
                LiquidBracketHandler.getLiquid("obsidian.molten").withAmount(288), 850,
                ItemBracketHandler.getItem("minecraft:obsidian", 0))
        Casting.addBasinRecipe(item11, LiquidBracketHandler.getLiquid("ender").withAmount(2250), null, false, 250)
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2089),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("IC2:blockMetal", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11089),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("IC2:blockMetal", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 9089),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(16), 400,
                ItemBracketHandler.getItem("IC2:blockMetal", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 17089),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(144), 400,
                ItemBracketHandler.getItem("IC2:blockMetal", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 23089),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(72), 400,
                ItemBracketHandler.getItem("IC2:blockMetal", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("IC2:blockMetal", 4),
                LiquidBracketHandler.getLiquid("lead.molten").withAmount(1296), 400,
                ItemBracketHandler.getItem("IC2:blockMetal", 4))
        Smeltery.addMelting(ItemBracketHandler.getItem("TConstruct:MetalBlock", 10),
                LiquidBracketHandler.getLiquid("ender").withAmount(2250), 250,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 10))
        Casting.addTableRecipe(ItemBracketHandler.getItem("minecraft:glass_bottle", 0),
                LiquidBracketHandler.getLiquid("glass.molten").withAmount(144),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32305), false, 200)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:LavaTank", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                        ItemBracketHandler.getItem("TConstruct:materials", 2),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 2), null,
                                ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:LavaTankNether", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                        ItemBracketHandler.getItem("TConstruct:materials", 37),
                        ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 37), null,
                                ItemBracketHandler.getItem("TConstruct:materials", 37)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:Smeltery", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                        ItemBracketHandler.getItem("TConstruct:materials", 2),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("minecraft:furnace", 0),
                                ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                        ItemBracketHandler.getItem("TConstruct:materials", 37),
                        ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("Natura:NetherFurnace", 0),
                                ItemBracketHandler.getItem("TConstruct:materials", 37)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:Smeltery", 2).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                        ItemBracketHandler.getItem("TConstruct:materials", 2),
                        ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                                ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:Smeltery", 2).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                        ItemBracketHandler.getItem("TConstruct:materials", 2),
                        ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0),
                                ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                        ItemBracketHandler.getItem("TConstruct:materials", 37),
                        ItemBracketHandler.getItem("TConstruct:materials", 37)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("minecraft:lava_bucket", 0),
                                ItemBracketHandler.getItem("TConstruct:materials", 37)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:materials", 37))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2).amount(2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                        ItemBracketHandler.getItem("TConstruct:materials", 37),
                        ItemBracketHandler.getItem("TConstruct:materials", 37)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketLava", 0),
                                ItemBracketHandler.getItem("TConstruct:materials", 37)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:materials", 37))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:Smeltery", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                        ItemBracketHandler.getItem("TConstruct:materials", 2),
                        ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:CastingChannel", 0),
                                ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                        ItemBracketHandler.getItem("TConstruct:materials", 37),
                        ItemBracketHandler.getItem("TConstruct:materials", 37)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:CastingChannel", 0),
                                ItemBracketHandler.getItem("TConstruct:materials", 37)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:materials", 37))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SearedBlock", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 2), null,
                        ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 4),
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:Smeltery", 2), null,
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SearedBlockNether", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 37), null,
                        ItemBracketHandler.getItem("TConstruct:materials", 37)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2), null,
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SearedBlock", 2),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:Smeltery", 2), null,
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:Smeltery", 2), null,
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SearedBlockNether", 2),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2), null,
                        ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2), null,
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:CastingChannel", 0),
                arrayOf(arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 2), null,
                        ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 2), null,
                                ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SearedBlock", 1).amount(2),
                arrayOf(arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:CastingChannel", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SearedBlockNether", 1).amount(2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("TConstruct:CastingChannel", 0),
                        OreBracketHandler.getOre("craftingToolSaw"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SearedBlock", 1),
                arrayOf(arrayOfNulls(3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 2), null,
                                ItemBracketHandler.getItem("TConstruct:materials", 2)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2),
                                ItemBracketHandler.getItem("TConstruct:materials", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:SearedBlockNether", 1),
                arrayOf(arrayOfNulls(3),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 37), null,
                                ItemBracketHandler.getItem("TConstruct:materials", 37)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:materials", 37),
                                ItemBracketHandler.getItem("TConstruct:materials", 37))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:LavaTank", 1),
                arrayOf(arrayOf(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                        OreBracketHandler.getOre("glassReinforced"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("glassReinforced"),
                                OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("glassReinforced")),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                                OreBracketHandler.getOre("glassReinforced"),
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:LavaTankNether", 1),
                arrayOf(arrayOf(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                        OreBracketHandler.getOre("glassReinforced"),
                        ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2)),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("glassReinforced"),
                                OreBracketHandler.getOre("blockGlass"), OreBracketHandler.getOre("glassReinforced")),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                                OreBracketHandler.getOre("glassReinforced"),
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:LavaTank", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                        OreBracketHandler.getOre("glassReinforced"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 2)),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                                OreBracketHandler.getOre("blockGlass"),
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 2)),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                                OreBracketHandler.getOre("glassReinforced"),
                                ItemBracketHandler.getItem("TConstruct:Smeltery", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:LavaTankNether", 2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                        OreBracketHandler.getOre("glassReinforced"),
                        ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2)),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                                OreBracketHandler.getOre("blockGlass"),
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2)),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2),
                                OreBracketHandler.getOre("glassReinforced"),
                                ItemBracketHandler.getItem("TConstruct:SmelteryNether", 2))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:helmetWood", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("logWood"), OreBracketHandler.getOre("logWood"),
                        OreBracketHandler.getOre("logWood")), arrayOf<IIngredient?>(OreBracketHandler.getOre("logWood"),
                        OreBracketHandler.getOre("craftingToolSoftHammer"), OreBracketHandler.getOre("logWood")),
                        arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:chestplateWood", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("logWood"),
                        OreBracketHandler.getOre("craftingToolSoftHammer"), OreBracketHandler.getOre("logWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("logWood"), OreBracketHandler.getOre("logWood"),
                                OreBracketHandler.getOre("logWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("logWood"), OreBracketHandler.getOre("logWood"),
                                OreBracketHandler.getOre("logWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:leggingsWood", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("logWood"), OreBracketHandler.getOre("logWood"),
                        OreBracketHandler.getOre("logWood")), arrayOf<IIngredient?>(OreBracketHandler.getOre("logWood"),
                        OreBracketHandler.getOre("craftingToolSoftHammer"), OreBracketHandler.getOre("logWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("logWood"), null,
                                OreBracketHandler.getOre("logWood"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:bootsWood", 0),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("logWood"),
                        OreBracketHandler.getOre("craftingToolSoftHammer"), OreBracketHandler.getOre("logWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("logWood"), null,
                                OreBracketHandler.getOre("logWood")), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPane", 0).amount(2),
                arrayOf(arrayOf<IIngredient?>(OreBracketHandler.getOre("craftingToolSaw"), null, null),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("TConstruct:GlassBlock", 0), null)),
                null)
        MineTweakerAPI.recipes.addShaped(item13.amount(4), arrayOf(arrayOf<IIngredient>(ore2, ore2, ore2),
                arrayOf(ore3, ItemBracketHandler.getItem("minecraft:water_bucket", 0), ore3),
                arrayOf<IIngredient>(item14, item14, item14)), null)
        MineTweakerAPI.recipes.addShaped(item13.amount(4), arrayOf(arrayOf<IIngredient>(item14, item14, item14),
                arrayOf(ore3, ItemBracketHandler.getItem("minecraft:water_bucket", 0), ore3),
                arrayOf<IIngredient>(ore2, ore2, ore2)), null)
        MineTweakerAPI.recipes.addShaped(item13.amount(4), arrayOf(arrayOf(ore2, ore3, item14),
                arrayOf(ore2, ItemBracketHandler.getItem("minecraft:water_bucket", 0), item14),
                arrayOf(ore2, ore3, item14)), null)
        MineTweakerAPI.recipes.addShaped(item13.amount(4), arrayOf(arrayOf(item14, ore3, ore2),
                arrayOf(item14, ItemBracketHandler.getItem("minecraft:water_bucket", 0), ore2),
                arrayOf(item14, ore3, ore2)), null)
        MineTweakerAPI.recipes.addShaped(item13.amount(4), arrayOf(arrayOf<IIngredient>(ore2, ore2, ore2),
                arrayOf(ore3, ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0), ore3),
                arrayOf<IIngredient>(item14, item14, item14)), null)
        MineTweakerAPI.recipes.addShaped(item13.amount(4), arrayOf(arrayOf<IIngredient>(item14, item14, item14),
                arrayOf(ore3, ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0), ore3),
                arrayOf<IIngredient>(ore2, ore2, ore2)), null)
        MineTweakerAPI.recipes.addShaped(item13.amount(4), arrayOf(arrayOf(ore2, ore3, item14),
                arrayOf(ore2, ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0), item14),
                arrayOf(ore2, ore3, item14)), null)
        MineTweakerAPI.recipes.addShaped(item13.amount(4), arrayOf(arrayOf(item14, ore3, ore2),
                arrayOf(item14, ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0), ore2),
                arrayOf(item14, ore3, ore2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 6),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:nether_wart", 0),
                        ItemBracketHandler.getItem("minecraft:soul_sand", 0), item14,
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 6),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:nether_wart", 0),
                        ItemBracketHandler.getItem("minecraft:soul_sand", 0), item14,
                        ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 6),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:nether_wart", 0),
                        ItemBracketHandler.getItem("Natura:soil.tainted", 0),
                        ItemBracketHandler.getItem("Natura:heatsand", 0),
                        ItemBracketHandler.getItem("minecraft:water_bucket", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 6),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:nether_wart", 0),
                        ItemBracketHandler.getItem("Natura:soil.tainted", 0),
                        ItemBracketHandler.getItem("Natura:heatsand", 0),
                        ItemBracketHandler.getItem("IguanaTweaksTConstruct:clayBucketWater", 0)), null)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 2),
                ItemBracketHandler.getItem("dreamcraft:item.UnfiredSearedBrick", 0), 0.0)
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:slime.gel", 0), item16.amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:slime.gel", 1), item15.amount(4))
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                arrayOf<IIngredient>(OreBracketHandler.getOre("platePaper"), OreBracketHandler.getOre("platePaper"),
                        OreBracketHandler.getOre("platePaper"), OreBracketHandler.getOre("platePaper")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingStation", 0),
                arrayOf<IIngredient>(OreBracketHandler.getOre("craftingToolSaw"),
                        OreBracketHandler.getOre("craftingTableWood")), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 0),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:CraftingStation", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("TConstruct:CraftingStation", 0),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 0),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")), arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:crafting_table", 0),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 1),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:trap.barricade.oak", 0),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("TConstruct:trap.barricade.oak", 0)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 2),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:trap.barricade.spruce", 0),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("TConstruct:trap.barricade.spruce", 0)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:trap.barricade.birch", 0),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("TConstruct:trap.barricade.birch", 0)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 4),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:trap.barricade.jungle", 0),
                                OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("TConstruct:trap.barricade.jungle", 0)),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 4)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 5),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf(OreBracketHandler.getOre("stickWood"), item17, OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 4),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 5)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 10),
                arrayOf(arrayOf(OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")),
                        arrayOf<IIngredient?>(OreBracketHandler.getOre("fenceWood"),
                                OreBracketHandler.getOre("stickWood"), OreBracketHandler.getOre("fenceWood")),
                        arrayOf<IIngredient?>(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 10),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 11)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 10),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 12)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 10),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 13)), null)
        val recipes = MineTweakerAPI.recipes
        val item28 = ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 11)
        val array = arrayOf(
                arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")), null, null)
        val n = 1
        val array2 = arrayOfNulls<IIngredient>(3)
        val n2 = 0
        val item29 = ItemBracketHandler.getItem("ExtraTrees:multifence", 16387)
        val hashMap = HashMap<String, IData>()
        hashMap["meta"] = ExpandInt.toData(65537)
        array2[n2] = item29.withTag(ExpandAnyDict.asData(hashMap))
        array2[1] = OreBracketHandler.getOre("stickWood")
        val n3 = 2
        val item30 = ItemBracketHandler.getItem("ExtraTrees:multifence", 16387)
        val hashMap2 = HashMap<String, IData>()
        hashMap2["meta"] = ExpandInt.toData(65537)
        array2[n3] = item30.withTag(ExpandAnyDict.asData(hashMap2))
        array[n] = array2
        array[2] = arrayOf(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)
        recipes.addShaped(item28, array, null)
        val recipes2 = MineTweakerAPI.recipes
        val item31 = ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 12)
        val array3 = arrayOf(
                arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")), null, null)
        val n4 = 1
        val array4 = arrayOfNulls<IIngredient>(3)
        val n5 = 0
        val item32 = ItemBracketHandler.getItem("ExtraTrees:multifence", 16387)
        val hashMap3 = HashMap<String, IData>()
        hashMap3["meta"] = ExpandInt.toData(131074)
        array4[n5] = item32.withTag(ExpandAnyDict.asData(hashMap3))
        array4[1] = OreBracketHandler.getOre("stickWood")
        val n6 = 2
        val item33 = ItemBracketHandler.getItem("ExtraTrees:multifence", 16387)
        val hashMap4 = HashMap<String, IData>()
        hashMap4["meta"] = ExpandInt.toData(131074)
        array4[n6] = item33.withTag(ExpandAnyDict.asData(hashMap4))
        array3[n4] = array4
        array3[2] = arrayOf(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)
        recipes2.addShaped(item31, array3, null)
        val recipes3 = MineTweakerAPI.recipes
        val item34 = ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 13)
        val array5 = arrayOf(
                arrayOf(OreBracketHandler.getOre("stickWood"), ItemBracketHandler.getItem("TConstruct:blankPattern", 0),
                        OreBracketHandler.getOre("stickWood")), null, null)
        val n7 = 1
        val array6 = arrayOfNulls<IIngredient>(3)
        val n8 = 0
        val item35 = ItemBracketHandler.getItem("ExtraTrees:multifence", 16387)
        val hashMap5 = HashMap<String, IData>()
        hashMap5["meta"] = ExpandInt.toData(196611)
        array6[n8] = item35.withTag(ExpandAnyDict.asData(hashMap5))
        array6[1] = OreBracketHandler.getOre("stickWood")
        val n9 = 2
        val item36 = ItemBracketHandler.getItem("ExtraTrees:multifence", 16387)
        val hashMap6 = HashMap<String, IData>()
        hashMap6["meta"] = ExpandInt.toData(196611)
        array6[n9] = item36.withTag(ExpandAnyDict.asData(hashMap6))
        array5[n7] = array6
        array5[2] = arrayOf(null, OreBracketHandler.getOre("craftingToolSoftHammer"), null)
        recipes3.addShaped(item34, array5, null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 3),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 10)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 3),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 11)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 3),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 12)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 3),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolStationBlock", 13)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockIron"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockIron")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockIron"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockIron"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockGold"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockGold")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockGold"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockGold"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockDiamond"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockDiamond")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockDiamond"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockDiamond"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockEmerald"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockEmerald")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockEmerald"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockEmerald"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 4),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockCobalt"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockCobalt")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockCobalt"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockCobalt"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 5),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockArdite"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockArdite")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockArdite"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockArdite"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 6),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockManyullyn"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockManyullyn")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockManyullyn"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockManyullyn"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 7),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockCopper"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockCopper")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockCopper"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockCopper"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 8),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockBronze"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockBronze")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockBronze"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockBronze"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 9),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockTin"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockTin")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockTin"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockTin"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 10),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockAluminium"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockAluminium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockAluminium"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockAluminium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 11),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockAluminiumBrass"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockAluminiumBrass")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockAluminiumBrass"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockAluminiumBrass"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 12),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockAlumite"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockAlumite")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockAlumite"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockAlumite"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 13),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                        ItemBracketHandler.getItem("TConstruct:SearedSlab", 1),
                        ItemBracketHandler.getItem("TConstruct:heavyPlate", 15)),
                        arrayOf(OreBracketHandler.getOre("blockSteel"),
                                ItemBracketHandler.getItem("TConstruct:CraftingSlab", 1),
                                OreBracketHandler.getOre("blockSteel")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("blockSteel"),
                                OreBracketHandler.getOre("craftingToolHardHammer"),
                                OreBracketHandler.getOre("blockSteel"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:FurnaceSlab", 0),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("minecraft:furnace", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:CraftingSlab", 5),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:ToolForgeBlock", 32767)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SearedSlab", 0).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SearedSlab", 1).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 4)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SearedSlab", 2).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 5)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SearedSlab", 3).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 6)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SearedSlab", 4).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 8)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SearedSlab", 5).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 9)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SearedSlab", 6).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 10)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SearedSlab", 7).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 11)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:Smeltery", 7),
                arrayOf(OreBracketHandler.getOre("craftingToolHardHammer"),
                        ItemBracketHandler.getItem("TConstruct:Smeltery", 2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 0).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:SpeedBlock", 0)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 1).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:SpeedBlock", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 2).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:SpeedBlock", 2)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 3).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:SpeedBlock", 3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 4).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:SpeedBlock", 4)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 5).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:SpeedBlock", 5)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 6).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:SpeedBlock", 6)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:SpeedSlab", 7).amount(2),
                arrayOf(OreBracketHandler.getOre("craftingToolSaw"),
                        ItemBracketHandler.getItem("TConstruct:SpeedBlock", 7)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:trap.punji", 0).amount(2),
                arrayOf(arrayOf(ItemBracketHandler.getItem("minecraft:reeds", 0), OreBracketHandler.getOre("stickWood"),
                        ItemBracketHandler.getItem("minecraft:reeds", 0)),
                        arrayOf<IIngredient>(item7, ItemBracketHandler.getItem("minecraft:reeds", 0), item7),
                        arrayOf(ItemBracketHandler.getItem("minecraft:reeds", 0), OreBracketHandler.getOre("stickWood"),
                                ItemBracketHandler.getItem("minecraft:reeds", 0))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab1", 0).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 0)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab1", 1).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 1)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab1", 2).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 2)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab1", 3).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 3)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab1", 4).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 4)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab1", 5).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 5)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab1", 6).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 6)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab1", 7).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 7)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab2", 0).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 8)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab2", 1).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 9)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab2", 2).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 10)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab2", 3).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 11)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab2", 4).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 12)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab2", 5).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 13)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab2", 6).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 14)),
                null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:WoolSlab2", 7).amount(2),
                arrayOf(IngredientTransform.transformDamage(ore20), ItemBracketHandler.getItem("minecraft:wool", 15)),
                null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:trap.barricade.oak", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:log", 0), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:log", 0), item7,
                                ItemBracketHandler.getItem("minecraft:log", 0)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:log", 0), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:trap.barricade.spruce", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:log", 1), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:log", 1), item7,
                                ItemBracketHandler.getItem("minecraft:log", 1)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:log", 1), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:trap.barricade.birch", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:log", 2), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:log", 2), item7,
                                ItemBracketHandler.getItem("minecraft:log", 2)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:log", 2), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:trap.barricade.jungle", 0),
                arrayOf(arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:log", 3), null),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("minecraft:log", 3), item7,
                                ItemBracketHandler.getItem("minecraft:log", 3)),
                        arrayOf<IIngredient?>(null, ItemBracketHandler.getItem("minecraft:log", 3), null)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:slime.channel", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slimeball"),
                        OreBracketHandler.getOre("slimeball"), OreBracketHandler.getOre("slimeball")),
                        arrayOf(OreBracketHandler.getOre("dustRedstone"),
                                ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                                OreBracketHandler.getOre("dustRedstone")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("slimeball"),
                                OreBracketHandler.getOre("slimeball"), OreBracketHandler.getOre("slimeball"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:blood.channel", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:strangeFood", 1),
                        ItemBracketHandler.getItem("TConstruct:strangeFood", 1),
                        ItemBracketHandler.getItem("TConstruct:strangeFood", 1)),
                        arrayOf(OreBracketHandler.getOre("dustRedstone"),
                                ItemBracketHandler.getItem("minecraft:water_bucket", 0),
                                OreBracketHandler.getOre("dustRedstone")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:strangeFood", 1),
                                ItemBracketHandler.getItem("TConstruct:strangeFood", 1),
                                ItemBracketHandler.getItem("TConstruct:strangeFood", 1))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:slime.pad", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:slime.gel", 0),
                        ItemBracketHandler.getItem("TConstruct:slime.gel", 0),
                        ItemBracketHandler.getItem("TConstruct:slime.gel", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:slime.channel", 0),
                                ItemBracketHandler.getItem("TConstruct:slime.gel", 1),
                                ItemBracketHandler.getItem("TConstruct:slime.channel", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:slime_ball", 0),
                        ItemBracketHandler.getItem("minecraft:slime_ball", 0),
                        ItemBracketHandler.getItem("minecraft:slime_ball", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:dirt", 0),
                                ItemBracketHandler.getItem("TConstruct:CraftedSoil", 1),
                                ItemBracketHandler.getItem("minecraft:dirt", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:slime_ball", 0),
                                ItemBracketHandler.getItem("minecraft:slime_ball", 0),
                                ItemBracketHandler.getItem("minecraft:slime_ball", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:strangeFood", 0),
                        ItemBracketHandler.getItem("TConstruct:strangeFood", 0),
                        ItemBracketHandler.getItem("TConstruct:strangeFood", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:dirt", 0),
                                ItemBracketHandler.getItem("TConstruct:CraftedSoil", 1),
                                ItemBracketHandler.getItem("minecraft:dirt", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:strangeFood", 0),
                                ItemBracketHandler.getItem("TConstruct:strangeFood", 0),
                                ItemBracketHandler.getItem("TConstruct:strangeFood", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 3),
                arrayOf(arrayOf(OreBracketHandler.getOre("dustBone"),
                        ItemBracketHandler.getItem("minecraft:rotten_flesh", 0), OreBracketHandler.getOre("dustBone")),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                                ItemBracketHandler.getItem("minecraft:dirt", 0),
                                ItemBracketHandler.getItem("minecraft:rotten_flesh", 0)),
                        arrayOf(OreBracketHandler.getOre("dustBone"),
                                ItemBracketHandler.getItem("minecraft:rotten_flesh", 0),
                                OreBracketHandler.getOre("dustBone"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 0).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore4, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 0),
                arrayOf(item18, ore4), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 1).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore5, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 1),
                arrayOf(item18, ore5), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 2).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore6, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 2),
                arrayOf(item18, ore6), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 3).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore7, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 3),
                arrayOf(item18, ore7), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 4).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore8, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 4),
                arrayOf(item18, ore8), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 5).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore9, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 5),
                arrayOf(item18, ore9), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 6).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore10, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 6),
                arrayOf(item18, ore10), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 7).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore11, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 7),
                arrayOf(item18, ore11), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 8).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore12, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 8),
                arrayOf(item18, ore12), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 9).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore13, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 9),
                arrayOf(item18, ore13), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 10).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore14, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 10),
                arrayOf(item18, ore14), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 11).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore15, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 11),
                arrayOf(item18, ore15), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 12).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore16, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 12),
                arrayOf(item18, ore16), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 13).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore17, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 13),
                arrayOf(item18, ore17), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 14).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore18, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 14),
                arrayOf(item18, ore18), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 15).amount(7),
                arrayOf(arrayOf<IIngredient>(item18, item18, item18), arrayOf(item18, ore19, item18),
                        arrayOf<IIngredient>(item18, item27, item18)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock.StainedClear", 15),
                arrayOf(item18, ore19), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 0).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore4, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 0),
                arrayOf(item19, ore4), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 1).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore5, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 1),
                arrayOf(item19, ore5), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 2).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore6, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 2),
                arrayOf(item19, ore6), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 3).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore7, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 3),
                arrayOf(item19, ore7), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 4).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore8, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 4),
                arrayOf(item19, ore8), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 5).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore9, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 5),
                arrayOf(item19, ore9), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 6).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore10, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 6),
                arrayOf(item19, ore10), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 7).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore11, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 7),
                arrayOf(item19, ore11), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 8).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore12, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 8),
                arrayOf(item19, ore12), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 9).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore13, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 9),
                arrayOf(item19, ore13), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 10).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore14, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 10),
                arrayOf(item19, ore14), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 11).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore15, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 11),
                arrayOf(item19, ore15), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 12).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore16, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 12),
                arrayOf(item19, ore16), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 13).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore17, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 13),
                arrayOf(item19, ore17), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 14).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore18, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 14),
                arrayOf(item19, ore18), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 15).amount(7),
                arrayOf(arrayOf<IIngredient>(item19, item19, item19), arrayOf(item19, ore19, item19),
                        arrayOf<IIngredient>(item19, item27, item19)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassPaneClearStained", 15),
                arrayOf(item19, ore19), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:Armor.DryingRack", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("slabWood"), OreBracketHandler.getOre("slabWood"),
                        OreBracketHandler.getOre("slabWood")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("screwWood"),
                                OreBracketHandler.getOre("craftingToolScrewdriver"),
                                OreBracketHandler.getOre("screwWood"))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:Armor.DryingRack", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:Armor.DryingRack", 5)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:Armor.DryingRack", 5),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:Armor.DryingRack", 0)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:Redstone.Landmine", 0),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:repeater", 0),
                        ItemBracketHandler.getItem("minecraft:light_weighted_pressure_plate", 0),
                        ItemBracketHandler.getItem("minecraft:repeater", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone", 0),
                                ItemBracketHandler.getItem("Railcraft:detector", 1),
                                ItemBracketHandler.getItem("minecraft:stone", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:Redstone.Landmine", 1),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:repeater", 0),
                        ItemBracketHandler.getItem("minecraft:light_weighted_pressure_plate", 0),
                        ItemBracketHandler.getItem("minecraft:repeater", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone", 0),
                                ItemBracketHandler.getItem("Railcraft:detector", 3),
                                ItemBracketHandler.getItem("minecraft:stone", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:Redstone.Landmine", 2),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:repeater", 0),
                        ItemBracketHandler.getItem("minecraft:light_weighted_pressure_plate", 0),
                        ItemBracketHandler.getItem("minecraft:repeater", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone", 0),
                                ItemBracketHandler.getItem("Railcraft:detector", 5),
                                ItemBracketHandler.getItem("minecraft:stone", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:Redstone.Landmine", 3),
                arrayOf(arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:repeater", 0),
                        ItemBracketHandler.getItem("minecraft:light_weighted_pressure_plate", 0),
                        ItemBracketHandler.getItem("minecraft:repeater", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:stone", 0),
                                ItemBracketHandler.getItem("Railcraft:detector", 4),
                                ItemBracketHandler.getItem("minecraft:stone", 0))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("TConstruct:materials", 40),
                arrayOf(arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2019)),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2019),
                arrayOf(arrayOf<IIngredient?>(null, null, ItemBracketHandler.getItem("TConstruct:materials", 40)),
                        arrayOfNulls(3), arrayOfNulls(3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:toolRod", 6),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("RandomThings:ingredient", 1)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("RandomThings:ingredient", 1),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:toolRod", 6)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:GlassBlock", 0),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock2", 0)), null)
        MineTweakerAPI.furnace.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 37),
                ItemBracketHandler.getItem("dreamcraft:item.UnfiredSlimeSoulBrick", 0), 0.0)
        Casting.addTableRecipe(ItemBracketHandler.getItem("IC2:itemArmorBronzeHelmet", 0),
                LiquidBracketHandler.getLiquid("bronze.molten").withAmount(720),
                ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0), false, 500)
        Casting.addTableRecipe(ItemBracketHandler.getItem("IC2:itemArmorBronzeChestplate", 0),
                LiquidBracketHandler.getLiquid("bronze.molten").withAmount(1152),
                ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0), false, 800)
        Casting.addTableRecipe(ItemBracketHandler.getItem("IC2:itemArmorBronzeLegs", 0),
                LiquidBracketHandler.getLiquid("bronze.molten").withAmount(1008),
                ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0), false, 700)
        Casting.addTableRecipe(ItemBracketHandler.getItem("IC2:itemArmorBronzeBoots", 0),
                LiquidBracketHandler.getLiquid("bronze.molten").withAmount(576),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0), false, 400)
        Casting.addTableRecipe(ItemBracketHandler.getItem("Railcraft:armor.steel.helmet", 0),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(720),
                ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0), false, 500)
        Casting.addTableRecipe(ItemBracketHandler.getItem("Railcraft:armor.steel.plate", 0),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(1152),
                ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0), false, 800)
        Casting.addTableRecipe(ItemBracketHandler.getItem("Railcraft:armor.steel.legs", 0),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(1008),
                ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0), false, 700)
        Casting.addTableRecipe(ItemBracketHandler.getItem("Railcraft:armor.steel.boots", 0),
                LiquidBracketHandler.getLiquid("steel.molten").withAmount(576),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0), false, 400)
        Casting.addTableRecipe(ItemBracketHandler.getItem("minecraft:iron_helmet", 0),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(720),
                ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0), false, 500)
        Casting.addTableRecipe(ItemBracketHandler.getItem("minecraft:iron_chestplate", 0),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(1152),
                ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0), false, 800)
        Casting.addTableRecipe(ItemBracketHandler.getItem("minecraft:iron_leggings", 0),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(1008),
                ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0), false, 700)
        Casting.addTableRecipe(ItemBracketHandler.getItem("minecraft:iron_boots", 0),
                LiquidBracketHandler.getLiquid("iron.molten").withAmount(576),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0), false, 400)
        Casting.addTableRecipe(ItemBracketHandler.getItem("minecraft:golden_helmet", 0),
                LiquidBracketHandler.getLiquid("gold.molten").withAmount(720),
                ItemBracketHandler.getItem("dreamcraft:item.MoldHelmet", 0), false, 500)
        Casting.addTableRecipe(ItemBracketHandler.getItem("minecraft:golden_chestplate", 0),
                LiquidBracketHandler.getLiquid("gold.molten").withAmount(1152),
                ItemBracketHandler.getItem("dreamcraft:item.MoldChestplate", 0), false, 800)
        Casting.addTableRecipe(ItemBracketHandler.getItem("minecraft:golden_leggings", 0),
                LiquidBracketHandler.getLiquid("gold.molten").withAmount(1008),
                ItemBracketHandler.getItem("dreamcraft:item.MoldLeggings", 0), false, 700)
        Casting.addTableRecipe(ItemBracketHandler.getItem("minecraft:golden_boots", 0),
                LiquidBracketHandler.getLiquid("gold.molten").withAmount(576),
                ItemBracketHandler.getItem("dreamcraft:item.MoldBoots", 0), false, 400)
        val recipes4 = MineTweakerAPI.recipes
        val hashMap7 = HashMap<String, IData>()
        val s = "TinkerArmor"
        val hashMap8 = HashMap<String, IData>()
        hashMap8["BaseDurability"] = ExpandInt.toData(1035)
        hashMap8["BaseDefense"] = ExpandDouble.asData(0.0)
        hashMap8["Built"] = ExpandByte.asData(1.toByte())
        hashMap8["MaxDefense"] = ExpandDouble.asData(4.0)
        hashMap8["Damage"] = ExpandInt.toData(0)
        hashMap8["BonusDurability"] = ExpandInt.toData(0)
        hashMap8["Modifiers"] = ExpandInt.toData(3)
        hashMap8["DamageReduction"] = ExpandDouble.asData(0.0)
        hashMap8["TotalDurability"] = ExpandInt.toData(1035)
        hashMap8["ModDurability"] = ExpandFloat.asData(0.0.toFloat())
        hashMap8["Broken"] = ExpandByte.asData(0.toByte())
        hashMap7[s] = ExpandAnyDict.asData(hashMap8)
        recipes4.addShaped(item24.withTag(ExpandAnyDict.asData(hashMap7)),
                arrayOf(arrayOf(ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
                        OreBracketHandler.getOre("boltElectrum"),
                        ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0)),
                        arrayOf(OreBracketHandler.getOre("ringElectrum"),
                                ItemBracketHandler.getItem("minecraft:diamond_helmet", 0),
                                OreBracketHandler.getOre("ringElectrum")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("lensDiamond"),
                                OreBracketHandler.getOre("circuitAdvanced"), OreBracketHandler.getOre("lensDiamond"))),
                null)
        val recipes5 = MineTweakerAPI.recipes
        val hashMap9 = HashMap<String, IData>()
        val s2 = "TinkerArmor"
        val hashMap10 = HashMap<String, IData>()
        hashMap10["BaseDurability"] = ExpandInt.toData(1035)
        hashMap10["BaseDefense"] = ExpandDouble.asData(4.0)
        hashMap10["Built"] = ExpandByte.asData(1.toByte())
        hashMap10["MaxDefense"] = ExpandDouble.asData(10.0)
        hashMap10["Damage"] = ExpandInt.toData(0)
        hashMap10["BonusDurability"] = ExpandInt.toData(0)
        hashMap10["Modifiers"] = ExpandInt.toData(3)
        hashMap10["DamageReduction"] = ExpandDouble.asData(0.0)
        hashMap10["TotalDurability"] = ExpandInt.toData(1035)
        hashMap10["ModDurability"] = ExpandFloat.asData(0.0.toFloat())
        hashMap10["Broken"] = ExpandByte.asData(0.toByte())
        hashMap9[s2] = ExpandAnyDict.asData(hashMap10)
        recipes5.addShaped(item25.withTag(ExpandAnyDict.asData(hashMap9)),
                arrayOf(arrayOf(ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
                        OreBracketHandler.getOre("circuitAdvanced"),
                        ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0)),
                        arrayOf(OreBracketHandler.getOre("plateObsidian"),
                                ItemBracketHandler.getItem("minecraft:diamond_chestplate", 0),
                                OreBracketHandler.getOre("plateObsidian")),
                        arrayOf(ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
                                OreBracketHandler.getOre("plateObsidian"),
                                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0))), null)
        val recipes6 = MineTweakerAPI.recipes
        val hashMap11 = HashMap<String, IData>()
        val s3 = "TinkerAccessory"
        val hashMap12 = HashMap<String, IData>()
        hashMap12["BaseDurability"] = ExpandInt.toData(500)
        hashMap12["Built"] = ExpandByte.asData(1.toByte())
        hashMap12["Damage"] = ExpandInt.toData(0)
        hashMap12["BonusDurability"] = ExpandInt.toData(0)
        hashMap12["TotalDurability"] = ExpandInt.toData(500)
        hashMap12["ModDurability"] = ExpandFloat.asData(0.0.toFloat())
        hashMap12["Modifiers"] = ExpandInt.toData(5)
        hashMap12["Broken"] = ExpandByte.asData(0.toByte())
        hashMap11[s3] = ExpandAnyDict.asData(hashMap12)
        recipes6.addShaped(item23.withTag(ExpandAnyDict.asData(hashMap11)),
                arrayOf(arrayOf(null, ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
                        OreBracketHandler.getOre("plateDiamond")),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
                                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
                                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0)),
                        arrayOf(null, ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
                                OreBracketHandler.getOre("circuitAdvanced"))), null)
        val recipes7 = MineTweakerAPI.recipes
        val hashMap13 = HashMap<String, IData>()
        val s4 = "TinkerArmor"
        val hashMap14 = HashMap<String, IData>()
        hashMap14["BaseDurability"] = ExpandInt.toData(1035)
        hashMap14["BaseDefense"] = ExpandDouble.asData(2.0)
        hashMap14["Built"] = ExpandByte.asData(1.toByte())
        hashMap14["MaxDefense"] = ExpandDouble.asData(8.0)
        hashMap14["Damage"] = ExpandInt.toData(0)
        hashMap14["BonusDurability"] = ExpandInt.toData(0)
        hashMap14["Modifiers"] = ExpandInt.toData(3)
        hashMap14["DamageReduction"] = ExpandDouble.asData(0.0)
        hashMap14["TotalDurability"] = ExpandInt.toData(1035)
        hashMap14["ModDurability"] = ExpandFloat.asData(0.0.toFloat())
        hashMap14["Broken"] = ExpandByte.asData(0.toByte())
        hashMap13[s4] = ExpandAnyDict.asData(hashMap14)
        recipes7.addShaped(item26.withTag(ExpandAnyDict.asData(hashMap13)),
                arrayOf(arrayOf(OreBracketHandler.getOre("plateDiamond"),
                        ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
                        OreBracketHandler.getOre("plateDiamond")),
                        arrayOf(ItemBracketHandler.getItem("TConstruct:fletching", 0),
                                OreBracketHandler.getOre("circuitAdvanced"),
                                ItemBracketHandler.getItem("TConstruct:fletching", 0)),
                        arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:fletching", 0),
                                ItemBracketHandler.getItem("minecraft:diamond_leggings", 0),
                                ItemBracketHandler.getItem("TConstruct:fletching", 0))), null)
        val recipes8 = MineTweakerAPI.recipes
        val hashMap15 = HashMap<String, IData>()
        val s5 = "TinkerAccessory"
        val hashMap16 = HashMap<String, IData>()
        hashMap16["BaseDurability"] = ExpandInt.toData(500)
        hashMap16["Built"] = ExpandByte.asData(1.toByte())
        hashMap16["Damage"] = ExpandInt.toData(0)
        hashMap16["BonusDurability"] = ExpandInt.toData(0)
        hashMap16["TotalDurability"] = ExpandInt.toData(500)
        hashMap16["ModDurability"] = ExpandFloat.asData(0.0.toFloat())
        hashMap16["Modifiers"] = ExpandInt.toData(5)
        hashMap16["Broken"] = ExpandByte.asData(0.toByte())
        hashMap15[s5] = ExpandAnyDict.asData(hashMap16)
        recipes8.addShaped(item21.withTag(ExpandAnyDict.asData(hashMap15)),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("circuitAdvanced"), null),
                        arrayOf(ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
                                OreBracketHandler.getOre("plateDiamond"),
                                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0)),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0), null,
                                ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0))), null)
        val recipes9 = MineTweakerAPI.recipes
        val hashMap17 = HashMap<String, IData>()
        val s6 = "TinkerArmor"
        val hashMap18 = HashMap<String, IData>()
        hashMap18["BaseDurability"] = ExpandInt.toData(1035)
        hashMap18["BaseDefense"] = ExpandDouble.asData(2.0)
        hashMap18["Built"] = ExpandByte.asData(1.toByte())
        hashMap18["MaxDefense"] = ExpandDouble.asData(6.0)
        hashMap18["Damage"] = ExpandInt.toData(0)
        hashMap18["BonusDurability"] = ExpandInt.toData(0)
        hashMap18["Modifiers"] = ExpandInt.toData(3)
        hashMap18["DamageReduction"] = ExpandDouble.asData(0.0)
        hashMap18["TotalDurability"] = ExpandInt.toData(1035)
        hashMap18["ModDurability"] = ExpandFloat.asData(0.0.toFloat())
        hashMap18["Broken"] = ExpandByte.asData(0.toByte())
        hashMap17[s6] = ExpandAnyDict.asData(hashMap18)
        recipes9.addShaped(item22.withTag(ExpandAnyDict.asData(hashMap17)),
                arrayOf(arrayOf<IIngredient?>(null, OreBracketHandler.getOre("plateDiamond"),
                        OreBracketHandler.getOre("plateDiamond")),
                        arrayOf(null, ItemBracketHandler.getItem("minecraft:diamond_boots", 0),
                                OreBracketHandler.getOre("circuitAdvanced")),
                        arrayOf<IIngredient?>(ItemBracketHandler.getItem("harvestcraft:hardenedleatherItem", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642))), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:materials", 3),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 3)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("TConstruct:materials", 5),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11386)), null)
        MineTweakerAPI.recipes.addShapeless(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11386),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("TConstruct:materials", 5)), null)
        Smeltery.addAlloy(LiquidBracketHandler.getLiquid("alumite.molten").withAmount(32),
                arrayOf(LiquidBracketHandler.getLiquid("aluminum.molten").withAmount(80),
                        LiquidBracketHandler.getLiquid("steel.molten").withAmount(32),
                        LiquidBracketHandler.getLiquid("obsidian.molten").withAmount(32)))
        Smeltery.addFuel(LiquidBracketHandler.getLiquid("ic2hotcoolant"), 900, 55)
        Smeltery.addFuel(LiquidBracketHandler.getLiquid("ic2pahoehoelava"), 3000, 90)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 1),
                ItemBracketHandler.getItem("TConstruct:CraftedSoil", 0).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0), 400, 16)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 17),
                ItemBracketHandler.getItem("TConstruct:CraftedSoil", 2).amount(2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0), 400, 16)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 32).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306).amount(0), 200, 8)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:materials", 27).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306).amount(0), 200, 4)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 14),
                ItemBracketHandler.getItem("TConstruct:materials", 24).amount(9),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306).amount(0), 200, 2)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 2),
                ItemBracketHandler.getItem("TConstruct:CraftedSoil", 1),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306).amount(0), 200, 16)
        AlloySmelter.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 37),
                ItemBracketHandler.getItem("TConstruct:CraftedSoil", 6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32306).amount(0), 200, 16)
        Assembler.addRecipe(ItemBracketHandler.getItem("TConstruct:explosive.slime", 0),
                ItemBracketHandler.getItem("TConstruct:slime.gel", 1), ItemBracketHandler.getItem("IC2:blockITNT", 0),
                600, 30)
        Assembler.addRecipe(ItemBracketHandler.getItem("TConstruct:explosive.slime", 2),
                ItemBracketHandler.getItem("TConstruct:slime.gel", 0),
                ItemBracketHandler.getItem("TConstruct:explosive.slime", 0), 600, 64)
        Assembler.addRecipe(ItemBracketHandler.getItem("TConstruct:heartCanister", 0),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 22019),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 27306).amount(4), 2400, 480)
        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("TConstruct:GlassBlock", 0)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glass", 0),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)), 100, 120, 1000)
        BlastFurnace.addRecipe(arrayOf(ItemBracketHandler.getItem("TConstruct:GlassPane", 0)),
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:glass_pane", 0),
                        ItemBracketHandler.getItem("gregtech:gt.integrated_circuit", 1).amount(0)), 100, 120, 1000)
        ChemicalReactor.addRecipe(ItemBracketHandler.getItem("TConstruct:diamondApple", 0),
                ItemBracketHandler.getItem("minecraft:diamond_block", 0).amount(8),
                ItemBracketHandler.getItem("minecraft:golden_apple", 1), 3600)
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2033),
                ItemBracketHandler.getItem("TConstruct:materials", 38)),
                ItemBracketHandler.getItem("TConstruct:materials", 41), 0, 1200)
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:MetalBlock", 2),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:MetalBlock", 2),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11386).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:MetalBlock", 8),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:MetalBlock", 1),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:MetalBlock", 7),
                ItemBracketHandler.getItem("TConstruct:materials", 14).amount(9))
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:Smeltery", 2),
                ItemBracketHandler.getItem("TConstruct:materials", 2).amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 1),
                ItemBracketHandler.getItem("TConstruct:CraftedSoil", 0).amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 17),
                ItemBracketHandler.getItem("TConstruct:CraftedSoil", 2).amount(4))
        Compressor.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 0),
                ItemBracketHandler.getItem("minecraft:paper", 0).amount(64))
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2896).amount(2)), null,
                ItemBracketHandler.getItem("TConstruct:strangeFood", 0), null,
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(50), intArrayOf(10000), 300, 5)
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2896).amount(2)), null,
                ItemBracketHandler.getItem("minecraft:slime_ball", 0), null,
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(50), intArrayOf(10000), 300, 5)
        Centrifuge.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2896).amount(8)), null,
                ItemBracketHandler.getItem("TConstruct:slime.gel", 2), null,
                LiquidBracketHandler.getLiquid("refinedglue").withAmount(200), intArrayOf(10000), 300, 5)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ArditePlate", 0).amount(9), null,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 1),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 4800, 30)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ArditePlate", 0).amount(9), null,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 1),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(750), 4800, 30)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ArditePlate", 0).amount(9), null,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 1),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(250), 2400, 30)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ManyullynPlate", 0).amount(9), null,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 2),
                LiquidBracketHandler.getLiquid("water").withAmount(1000), 9600, 30)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ManyullynPlate", 0).amount(9), null,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 2),
                LiquidBracketHandler.getLiquid("ic2distilledwater").withAmount(750), 9600, 30)
        CuttingSaw.addRecipe(ItemBracketHandler.getItem("dreamcraft:item.ManyullynPlate", 0).amount(9), null,
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 2),
                LiquidBracketHandler.getLiquid("lubricant").withAmount(250), 4800, 30)
        Extractor.addRecipe(ItemBracketHandler.getItem("TConstruct:strangeFood", 0),
                ItemBracketHandler.getItem("TConstruct:slime.sapling", 0))
        Extractor.addRecipe(ItemBracketHandler.getItem("TConstruct:strangeFood", 0).amount(4),
                ItemBracketHandler.getItem("TConstruct:slime.gel", 0))
        Extractor.addRecipe(ItemBracketHandler.getItem("minecraft:slime_ball", 0).amount(4),
                ItemBracketHandler.getItem("TConstruct:slime.gel", 1))
        Extractor.addRecipe(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2896),
                ItemBracketHandler.getItem("TConstruct:slime.leaves", 0).amount(16))
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 250, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 122, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 606, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 1200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 180, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 380, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 550, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 666, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 7500, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 97, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toolRod", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 1).amount(0), 1800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 501, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 179, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 245, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 1600, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 1213, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 2400, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 360, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 760, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 1101, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 1333, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 15000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 195, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:pickaxeHead", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 2).amount(0), 3600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 501, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 179, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 245, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 1600, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 1213, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 2400, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 360, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 760, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 1101, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 1333, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 15000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 195, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:shovelHead", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 3).amount(0), 3600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 501, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 179, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 245, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 1600, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 1213, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 2400, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 360, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 760, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 1101, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 1333, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 15000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 195, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hatchetHead", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 4).amount(0), 3600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 501, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 179, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 245, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 1600, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 1213, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 2400, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 360, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 760, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 1101, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 1333, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 15000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 195, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:swordBlade", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 5).amount(0), 3600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 250, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 90, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 122, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 606, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 1200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 180, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 380, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 550, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 666, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 7500, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 97, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:wideGuard", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 6).amount(0), 1800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 250, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 90, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 122, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 606, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 1200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 180, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 380, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 550, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 666, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 7500, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 97, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:handGuard", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 7).amount(0), 1800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 250, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 90, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 122, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 606, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 1200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 180, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 380, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 550, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 666, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 7500, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 97, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:crossbar", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 8).amount(0), 1800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 250, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 90, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 122, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 606, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 1200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 180, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 380, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 550, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 666, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 7500, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 97, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:binding", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 9).amount(0), 1800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 501, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 179, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 245, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 1600, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 1213, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 2400, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 360, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 760, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 1101, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 1333, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 15000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 195, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:frypanHead", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 10).amount(0), 3600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 501, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 179, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 245, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 1600, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 1213, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 2400, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 360, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 760, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 1101, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 1333, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 15000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 195, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:signHead", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 11).amount(0), 3600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 250, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 90, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 122, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 606, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 1200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 180, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 380, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 550, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 666, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 7500, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 97, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:knifeBlade", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 12).amount(0), 1800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 250, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 90, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 122, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 606, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 1200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 180, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 380, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 550, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 666, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 7500, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 97, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:chiselHead", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 13).amount(0), 1800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 1503, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 537, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 735, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 4800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 3639, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 7200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 1080, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 2280, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 3303, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 2400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 3999, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 45000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 585, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughRod", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 14).amount(0), 10800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 1503, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 537, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 735, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 4800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 3639, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 7200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 1080, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 2280, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 3303, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 2400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 3999, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 45000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 585, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:toughBinding", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 15).amount(0), 10800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 4008, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 1432, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 6),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11804).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 1432, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 1960, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 12800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 9704, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 19200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 2880, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 7680, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 8808, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 6400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 10664, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 120000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 1560, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:heavyPlate", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 16).amount(0), 28800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 4008, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 1432, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 1960, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 12800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 9704, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 19200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 2880, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 7680, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 8808, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 6400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 10664, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 120000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 1560, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:broadAxeHead", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 17).amount(0), 28800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 4008, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 1432, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 1960, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 12800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 9704, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 19200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 2880, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 7680, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 8808, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 6400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 10664, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 120000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 1560, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:scytheBlade", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 18).amount(0), 28800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 4008, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 1432, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 1960, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 12800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 9704, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 19200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 2880, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 7680, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 8808, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 6400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 10664, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 120000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 1560, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:excavatorHead", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 19).amount(0), 28800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 4008, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 1432, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 1960, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 12800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 9704, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 19200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 2880, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 7680, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 8808, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 6400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 10664, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 120000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 1560, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:largeSwordBlade", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 20).amount(0), 28800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 4008, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 1432, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 1960, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 12800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 9704, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 19200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 2880, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 7680, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 8808, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 6400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 10664, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 1600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 120000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 1560, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:hammerHead", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 21).amount(0), 28800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 1503, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 537, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 735, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 4800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 3639, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 7200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 1080, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 2280, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 3303, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 2400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 3999, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 45000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 585, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:fullGuard", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(3),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 22).amount(0), 10800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 501, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 179, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 245, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 1600, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 1213, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 2400, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 360, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 760, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 1101, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 1333, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 15000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 195, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:arrowhead", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:metalPattern", 25).amount(0), 3600, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 250, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 90, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 122, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 800, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 606, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 1200, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 180, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 380, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 550, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 666, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 100, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 7500, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 97, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:ShurikenPart", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0),
                ItemBracketHandler.getItem("TConstruct:Cast", 0).amount(0), 1800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 2004, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 716, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 980, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 6400, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 4852, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 9600, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 1440, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 3040, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 4404, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 3200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 5332, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 60000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 780, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowLimbPart", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(4),
                ItemBracketHandler.getItem("TConstruct:Cast", 1).amount(0), 14400, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 2505, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 895, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 1225, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 8000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 6065, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 12000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 1800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 3800, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 5505, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 4000, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 6665, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 1000, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 1000, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 75000, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 975, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:CrossbowBodyPart", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(5),
                ItemBracketHandler.getItem("TConstruct:Cast", 2).amount(0), 18000, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 2),
                ItemBracketHandler.getItem("minecraft:iron_ingot", 0).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 752, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 6),
                ItemBracketHandler.getItem("TConstruct:materials", 18).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 269, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 7),
                ItemBracketHandler.getItem("minecraft:netherbrick", 0).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 368, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 10),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11033).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 2400, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 11),
                ItemBracketHandler.getItem("TConstruct:materials", 4).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 1820, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 12),
                ItemBracketHandler.getItem("TConstruct:materials", 5).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 3600, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 13),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11035).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 540, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 14),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11300).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 1140, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 15),
                ItemBracketHandler.getItem("TConstruct:materials", 15).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 1652, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 16),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11305).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 1200, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 18),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 11307).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 2000, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 0).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 300, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 314),
                ItemBracketHandler.getItem("ExtraUtilities:unstableingot", 2).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 300, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 315),
                ItemBracketHandler.getItem("ExtraUtilities:bedrockiumIngot", 0).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 22500, 120)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 316),
                ItemBracketHandler.getItem("ExtraUtilities:decorativeBlock1", 8).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 293, 30)
        Extruder.addRecipe(ItemBracketHandler.getItem("TConstruct:BowLimbPart", 251),
                ItemBracketHandler.getItem("BloodArsenal:blood_infused_iron", 0).amount(2),
                ItemBracketHandler.getItem("TConstruct:Cast", 3).amount(0), 5400, 30)
        FluidExtractor.addRecipe(null, ItemBracketHandler.getItem("TConstruct:MetalBlock", 10),
                LiquidBracketHandler.getLiquid("ender").withAmount(2250), 10000, 200, 48)
        FluidExtractor.addRecipe(null, ItemBracketHandler.getItem("minecraft:ender_pearl", 0),
                LiquidBracketHandler.getLiquid("ender").withAmount(250), 10000, 100, 48)
        FluidExtractor.addRecipe(null, ItemBracketHandler.getItem("TConstruct:oreBerries", 5),
                LiquidBracketHandler.getLiquid("xpjuice").withAmount(250), 10000, 100, 16)
        FluidSolidifier.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 36),
                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32307).amount(0),
                LiquidBracketHandler.getLiquid("glue").withAmount(144), 100, 8)
        ForgeHammer.addRecipe(ItemBracketHandler.getItem("TConstruct:materials", 2).amount(3),
                ItemBracketHandler.getItem("TConstruct:Smeltery", 2), 20, 16)
        Drying.addRecipe(ItemBracketHandler.getItem("TConstruct:strangeFood", 1),
                ItemBracketHandler.getItem("TConstruct:jerky", 7), 6000)
        Drying.addRecipe(ItemBracketHandler.getItem("TConstruct:strangeFood", 0),
                ItemBracketHandler.getItem("TConstruct:jerky", 6), 6000)
        Drying.addRecipe(ItemBracketHandler.getItem("harvestcraft:muttonrawItem", 0),
                ItemBracketHandler.getItem("TConstruct:jerky", 3), 12000)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("TConstruct:materials", 38)),
                ItemBracketHandler.getItem("TConstruct:materials", 4), intArrayOf(10000), 300, 2)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("TConstruct:materials", 38).amount(9)),
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 1), intArrayOf(10000), 300, 2)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("TConstruct:materials", 41)),
                ItemBracketHandler.getItem("TConstruct:materials", 5), intArrayOf(10000), 300, 2)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("TConstruct:materials", 41).amount(9)),
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 2), intArrayOf(10000), 300, 2)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2033).amount(9)),
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 0), intArrayOf(10000), 300, 2)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("TConstruct:materials", 42).amount(9)),
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 7), intArrayOf(10000), 300, 2)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("TConstruct:materials", 42)),
                ItemBracketHandler.getItem("TConstruct:materials", 14), intArrayOf(10000), 300, 2)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2532).amount(9)),
                ItemBracketHandler.getItem("TConstruct:MetalBlock", 10), intArrayOf(10000), 300, 2)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2019)),
                ItemBracketHandler.getItem("TConstruct:materials", 12), intArrayOf(10000), 300, 2)
        Mixer.addRecipe(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 1).amount(8), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:sand", 32767).amount(3),
                        ItemBracketHandler.getItem("minecraft:gravel", 0).amount(3),
                        ItemBracketHandler.getItem("minecraft:clay", 0).amount(2)),
                LiquidBracketHandler.getLiquid("water").withAmount(2000), 120, 16)
        Mixer.addRecipe(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 6).amount(2), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:nether_wart", 0),
                        ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                        ItemBracketHandler.getItem("minecraft:gravel", 0),
                        ItemBracketHandler.getItem("Natura:soil.tainted", 0)),
                LiquidBracketHandler.getLiquid("water").withAmount(2000), 200, 16)
        Mixer.addRecipe(ItemBracketHandler.getItem("TConstruct:CraftedSoil", 6).amount(2), null,
                arrayOf<IIngredient>(ItemBracketHandler.getItem("minecraft:nether_wart", 0),
                        ItemBracketHandler.getItem("minecraft:soul_sand", 0),
                        ItemBracketHandler.getItem("minecraft:gravel", 0),
                        ItemBracketHandler.getItem("minecraft:sand", 32767)),
                LiquidBracketHandler.getLiquid("water").withAmount(2000), 200, 16)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("TConstruct:materials", 38).amount(2),
                ItemBracketHandler.getItem("TConstruct:materials", 38)),
                ItemBracketHandler.getItem("TConstruct:SearedBrick", 2), intArrayOf(10000, 1000), 400, 2)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809)),
                ItemBracketHandler.getItem("TConstruct:woodPattern", 32767), intArrayOf(10000), 200, 2)
        Pulverizer.addRecipe(arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 2809)),
                ItemBracketHandler.getItem("TConstruct:Pattern", 32767), intArrayOf(10000), 200, 2)
        MineTweakerAPI.oreDict["nuggetAluminium"].remove(ItemBracketHandler.getItem("TConstruct:oreBerries", 4))
        OreBracketHandler.getOre("bucketEnder").add(ItemBracketHandler.getItem("TConstruct:buckets", 23))
    }
}
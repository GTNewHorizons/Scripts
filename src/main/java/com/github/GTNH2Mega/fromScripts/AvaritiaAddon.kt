package com.github.GTNH2Mega.fromScripts

import java.lang.Runnable
import minetweaker.MineTweakerAPI
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.OreBracketHandler
import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting

class AvaritiaAddon : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("avaritiaddons:CompressedChest", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("avaritiaddons:ExtremeAutoCrafter", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("avaritiaddons:InfinityChest", 0))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("avaritiaddons:CompressedChest", 0), arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseObsidian"), OreBracketHandler.getOre("plateDenseObsidian"), OreBracketHandler.getOre("plateDenseObsidian")), arrayOf(OreBracketHandler.getOre("chestDiamond"), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32642), OreBracketHandler.getOre("chestDiamond")), arrayOf<IIngredient>(OreBracketHandler.getOre("plateDenseObsidian"), OreBracketHandler.getOre("plateDenseObsidian"), OreBracketHandler.getOre("plateDenseObsidian"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("avaritiaddons:ExtremeAutoCrafter", 0), arrayOf(arrayOf(OreBracketHandler.getOre("plateRedAlloy"), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32744), OreBracketHandler.getOre("plateRedAlloy")), arrayOf<IIngredient>(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603), ItemBracketHandler.getItem("Avaritia:Dire_Crafting", 0), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603)), arrayOf(ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32633), OreBracketHandler.getOre("circuitElite"), ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32633))), null)
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("avaritiaddons:InfinityChest", 0), arrayOf(arrayOf(OreBracketHandler.getOre("blockCosmicNeutronium"), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), OreBracketHandler.getOre("blockInfinity"), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), OreBracketHandler.getOre("blockCosmicNeutronium")), arrayOf(ItemBracketHandler.getItem("Avaritia:Resource", 0), OreBracketHandler.getOre("ingotInfinity"), OreBracketHandler.getOre("ingotInfinity"), ItemBracketHandler.getItem("Avaritia:Resource", 5), ItemBracketHandler.getItem("eternalsingularity:eternal_singularity", 0), ItemBracketHandler.getItem("Avaritia:Resource", 5), OreBracketHandler.getOre("ingotInfinity"), OreBracketHandler.getOre("ingotInfinity"), ItemBracketHandler.getItem("Avaritia:Resource", 0)), arrayOf(ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), OreBracketHandler.getOre("blockCosmicNeutronium"), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0)), arrayOf(ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), OreBracketHandler.getOre("blockCosmicNeutronium"), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0)), arrayOf(OreBracketHandler.getOre("blockInfinity"), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), OreBracketHandler.getOre("blockInfinity")), arrayOf<IIngredient>(ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("Avaritia:Resource", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("extracells:storage.component", 3), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("Avaritia:Resource", 0)), arrayOf<IIngredient>(ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("gregtech:gt.blockmachines", 129), ItemBracketHandler.getItem("Avaritia:Resource", 0)), arrayOf(OreBracketHandler.getOre("blockCosmicNeutronium"), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), OreBracketHandler.getOre("blockInfinity"), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), ItemBracketHandler.getItem("Avaritia:Resource", 0), OreBracketHandler.getOre("blockCosmicNeutronium"))))
    }
}
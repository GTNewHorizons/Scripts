package com.github.GTNH2Mega.fromScripts

import fox.spiteful.avaritia.compat.minetweaker.ExtremeCrafting
import minetweaker.MineTweakerAPI
import minetweaker.api.item.IIngredient
import minetweaker.mc1710.brackets.ItemBracketHandler
import minetweaker.mc1710.brackets.OreBracketHandler

class CompactKinetic_generators : Runnable {
    override fun run() {
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 1))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 2))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 3))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 4))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 5))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 6))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 7))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 8))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 9))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 10))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 11))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:IridiumBlade", 0))
        MineTweakerAPI.recipes.remove(ItemBracketHandler.getItem("compactkineticgenerators:IridiumRotor", 0))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 0),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                ItemBracketHandler.getItem("IC2:blockKineticGenerator", 0),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"), null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("itemCasingTungstenSteel"),
                                OreBracketHandler.getOre("gearGtSmallDesh"),
                                OreBracketHandler.getOre("cableGt02Tungsten"),
                                OreBracketHandler.getOre("gearGtSmallDesh"),
                                OreBracketHandler.getOre("itemCasingTungstenSteel"), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("IC2:blockKineticGenerator", 0),
                                OreBracketHandler.getOre("circuitElite"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 14),
                                OreBracketHandler.getOre("circuitElite"),
                                ItemBracketHandler.getItem("IC2:blockKineticGenerator", 0), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("itemCasingTungstenSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603),
                                OreBracketHandler.getOre("cableGt02Tungsten"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603),
                                OreBracketHandler.getOre("itemCasingTungstenSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                ItemBracketHandler.getItem("IC2:blockKineticGenerator", 0),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 1),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 0),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"), null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("itemCasingIridium"),
                                OreBracketHandler.getOre("gearGtSmallOriharukon"),
                                OreBracketHandler.getOre("wireGt04HSSG"),
                                OreBracketHandler.getOre("gearGtSmallOriharukon"),
                                OreBracketHandler.getOre("itemCasingIridium"), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 0),
                                OreBracketHandler.getOre("circuitMaster"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 15),
                                OreBracketHandler.getOre("circuitMaster"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 0), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("itemCasingIridium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604),
                                OreBracketHandler.getOre("wireGt04HSSG"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604),
                                OreBracketHandler.getOre("itemCasingIridium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 0),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 2),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 1),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0),
                                OreBracketHandler.getOre("gearGtSmallDraconium"),
                                OreBracketHandler.getOre("cableGt04VanadiumGallium"),
                                OreBracketHandler.getOre("gearGtSmallDraconium"),
                                ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 1),
                                OreBracketHandler.getOre("circuitUltimate"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 16),
                                OreBracketHandler.getOre("circuitUltimate"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 1), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32606),
                                OreBracketHandler.getOre("cableGt04VanadiumGallium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32606),
                                ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 1),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 3),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 2),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"), null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("itemCasingNeutronium"),
                                OreBracketHandler.getOre("gearGtSmallElectrumFlux"),
                                OreBracketHandler.getOre("cableGt08Duranium"),
                                OreBracketHandler.getOre("gearGtSmallElectrumFlux"),
                                OreBracketHandler.getOre("itemCasingNeutronium"), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 2),
                                OreBracketHandler.getOre("circuitSuperconductor"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 17),
                                OreBracketHandler.getOre("circuitSuperconductor"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 2), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("itemCasingNeutronium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32607),
                                OreBracketHandler.getOre("cableGt08Duranium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32607),
                                OreBracketHandler.getOre("itemCasingNeutronium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 2),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 4),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                ItemBracketHandler.getItem("IC2:blockKineticGenerator", 4),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("itemCasingTungstenSteel"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32613),
                                OreBracketHandler.getOre("cableGt02Tungsten"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32613),
                                OreBracketHandler.getOre("itemCasingTungstenSteel"), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("IC2:blockKineticGenerator", 4),
                                OreBracketHandler.getOre("circuitElite"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 14),
                                OreBracketHandler.getOre("circuitElite"),
                                ItemBracketHandler.getItem("IC2:blockKineticGenerator", 4), null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("itemCasingTungstenSteel"),
                                OreBracketHandler.getOre("gearGtSmallDesh"),
                                OreBracketHandler.getOre("cableGt02Tungsten"),
                                OreBracketHandler.getOre("gearGtSmallDesh"),
                                OreBracketHandler.getOre("itemCasingTungstenSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                ItemBracketHandler.getItem("IC2:blockKineticGenerator", 4),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 5),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 4),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("itemCasingIridium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32614),
                                OreBracketHandler.getOre("wireGt04HSSG"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32614),
                                OreBracketHandler.getOre("itemCasingIridium"), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 4),
                                OreBracketHandler.getOre("circuitMaster"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 15),
                                OreBracketHandler.getOre("circuitMaster"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 4), null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("itemCasingIridium"),
                                OreBracketHandler.getOre("gearGtSmallOriharukon"),
                                OreBracketHandler.getOre("wireGt04HSSG"),
                                OreBracketHandler.getOre("gearGtSmallOriharukon"),
                                OreBracketHandler.getOre("itemCasingIridium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 4),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 6),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 5),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32615),
                                OreBracketHandler.getOre("cableGt04VanadiumGallium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32615),
                                ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 5),
                                OreBracketHandler.getOre("circuitUltimate"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 16),
                                OreBracketHandler.getOre("circuitUltimate"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 5), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0),
                                OreBracketHandler.getOre("gearGtSmallDraconium"),
                                OreBracketHandler.getOre("cableGt04VanadiumGallium"),
                                OreBracketHandler.getOre("gearGtSmallDraconium"),
                                ItemBracketHandler.getItem("dreamcraft:item.IridiumAlloyItemCasing", 0), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 5),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 7),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 6),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("itemCasingNeutronium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32616),
                                OreBracketHandler.getOre("cableGt08Duranium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32616),
                                OreBracketHandler.getOre("itemCasingNeutronium"), null, null),
                        arrayOf(null, null, ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 6),
                                OreBracketHandler.getOre("circuitSuperconductor"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 17),
                                OreBracketHandler.getOre("circuitSuperconductor"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 6), null, null),
                        arrayOf<IIngredient?>(null, null, OreBracketHandler.getOre("itemCasingNeutronium"),
                                OreBracketHandler.getOre("gearGtSmallElectrumFlux"),
                                OreBracketHandler.getOre("cableGt08Duranium"),
                                OreBracketHandler.getOre("gearGtSmallElectrumFlux"),
                                OreBracketHandler.getOre("itemCasingNeutronium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 6),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 8),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                ItemBracketHandler.getItem("miscutils:itemTungstenSteelShaft", 0),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("rotorTungstenSteel"),
                                OreBracketHandler.getOre("gearDesh"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 14),
                                OreBracketHandler.getOre("gearDesh"), OreBracketHandler.getOre("rotorTungstenSteel"),
                                null, null), arrayOf(null, null, OreBracketHandler.getOre("cableGt02Tungsten"),
                        OreBracketHandler.getOre("circuitElite"), ItemBracketHandler.getItem("IC2:blockGenerator", 9),
                        OreBracketHandler.getOre("circuitElite"), OreBracketHandler.getOre("cableGt02Tungsten"), null,
                        null), arrayOf(null, null, OreBracketHandler.getOre("rotorTungstenSteel"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32540),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32603),
                        OreBracketHandler.getOre("rotorTungstenSteel"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                ItemBracketHandler.getItem("miscutils:itemTungstenSteelShaft", 0),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"),
                                OreBracketHandler.getOre("plateTripleTungstenSteel"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 9),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                ItemBracketHandler.getItem("miscutils:itemTungstenSteelShaft", 0),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("rotorIridium"),
                                OreBracketHandler.getOre("gearOriharukon"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 15),
                                OreBracketHandler.getOre("gearOriharukon"), OreBracketHandler.getOre("rotorIridium"),
                                null, null), arrayOf(null, null, OreBracketHandler.getOre("wireGt04HSSG"),
                        OreBracketHandler.getOre("circuitMaster"),
                        ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 8),
                        OreBracketHandler.getOre("circuitMaster"), OreBracketHandler.getOre("wireGt04HSSG"), null,
                        null), arrayOf(null, null, OreBracketHandler.getOre("rotorIridium"),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32545),
                        ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32604),
                        OreBracketHandler.getOre("rotorIridium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                ItemBracketHandler.getItem("miscutils:itemTungstenSteelShaft", 0),
                                OreBracketHandler.getOre("plateTripleIridium"),
                                OreBracketHandler.getOre("plateTripleIridium"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 10),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                ItemBracketHandler.getItem("miscutils:itemIridiumShaft", 0),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("rotorOsmium"),
                                OreBracketHandler.getOre("gearDraconium"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 16),
                                OreBracketHandler.getOre("gearDraconium"), OreBracketHandler.getOre("rotorOsmium"),
                                null, null), arrayOf(null, null, OreBracketHandler.getOre("cableGt04VanadiumGallium"),
                        OreBracketHandler.getOre("circuitUltimate"),
                        ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 9),
                        OreBracketHandler.getOre("circuitUltimate"),
                        OreBracketHandler.getOre("cableGt04VanadiumGallium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("rotorOsmium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32606),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32550),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32606),
                                OreBracketHandler.getOre("rotorOsmium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                ItemBracketHandler.getItem("miscutils:itemIridiumShaft", 0),
                                OreBracketHandler.getOre("plateTripleNaquadah"),
                                OreBracketHandler.getOre("plateTripleNaquadah"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        ExtremeCrafting.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 11),
                arrayOf(arrayOfNulls(9), arrayOfNulls(9),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                ItemBracketHandler.getItem("miscutils:itemIridiumShaft", 0),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("rotorNeutronium"),
                                OreBracketHandler.getOre("gearElectrumFlux"),
                                ItemBracketHandler.getItem("gregtech:gt.blockmachines", 17),
                                OreBracketHandler.getOre("gearElectrumFlux"),
                                OreBracketHandler.getOre("rotorNeutronium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("cableGt08Duranium"),
                                OreBracketHandler.getOre("circuitSuperconductor"),
                                ItemBracketHandler.getItem("compactkineticgenerators:BlockCkg", 10),
                                OreBracketHandler.getOre("circuitSuperconductor"),
                                OreBracketHandler.getOre("cableGt08Duranium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("rotorNeutronium"),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32607),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32555),
                                ItemBracketHandler.getItem("gregtech:gt.metaitem.01", 32607),
                                OreBracketHandler.getOre("rotorNeutronium"), null, null),
                        arrayOf(null, null, OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                ItemBracketHandler.getItem("miscutils:itemIridiumShaft", 0),
                                OreBracketHandler.getOre("plateTripleNeutronium"),
                                OreBracketHandler.getOre("plateTripleNeutronium"), null, null), arrayOfNulls(9),
                        arrayOfNulls(9)))
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:IridiumBlade", 0),
                arrayOf(arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyIridium"),
                        OreBracketHandler.getOre("plateAlloyIridium"), OreBracketHandler.getOre("plateAlloyIridium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyIridium"),
                                OreBracketHandler.getOre("ringOsmium"), OreBracketHandler.getOre("plateAlloyIridium")),
                        arrayOf<IIngredient>(OreBracketHandler.getOre("plateAlloyIridium"),
                                OreBracketHandler.getOre("plateAlloyIridium"),
                                OreBracketHandler.getOre("plateAlloyIridium"))), null)
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem("compactkineticgenerators:IridiumRotor", 0),
                arrayOf(arrayOf(ItemBracketHandler.getItem("miscutils:itemIridiumShaft", 0),
                        ItemBracketHandler.getItem("compactkineticgenerators:IridiumBlade", 0),
                        OreBracketHandler.getOre("craftingToolHardHammer")),
                        arrayOf(ItemBracketHandler.getItem("compactkineticgenerators:IridiumBlade", 0),
                                OreBracketHandler.getOre("ringChrome"),
                                ItemBracketHandler.getItem("compactkineticgenerators:IridiumBlade", 0)),
                        arrayOf(OreBracketHandler.getOre("craftingToolWrench"),
                                ItemBracketHandler.getItem("compactkineticgenerators:IridiumBlade", 0),
                                ItemBracketHandler.getItem("miscutils:itemIridiumShaft", 0))), null)
    }
}
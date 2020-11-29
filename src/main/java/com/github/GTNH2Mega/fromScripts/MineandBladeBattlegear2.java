package com.github.GTNH2Mega.fromScripts;
import java.util.HashMap;
import minetweaker.MineTweakerAPI;
import minetweaker.api.data.IData;
import minetweaker.api.item.IIngredient;
import minetweaker.api.item.IItemStack;
import minetweaker.expand.ExpandAnyDict;
import minetweaker.expand.ExpandString;
import minetweaker.mc1710.brackets.ItemBracketHandler;
import minetweaker.mc1710.brackets.OreBracketHandler;
import static com.github.GTNH2Mega.VoltageLevels.*;
public class MineandBladeBattlegear2
implements Runnable {
    public void run() {
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:shield.wood", (int)0), (IIngredient[][])new IIngredient[][]{{OreBracketHandler.getOre((String)"itemFlint"), OreBracketHandler.getOre((String)"logWood"), OreBracketHandler.getOre((String)"itemFlint")}, {OreBracketHandler.getOre((String)"logWood"), OreBracketHandler.getOre((String)"stoneCobble"), OreBracketHandler.getOre((String)"logWood")}, {OreBracketHandler.getOre((String)"itemFlint"), OreBracketHandler.getOre((String)"logWood"), OreBracketHandler.getOre((String)"itemFlint")}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:shield.hide", (int)0), (IIngredient[][])new IIngredient[][]{{OreBracketHandler.getOre((String)"itemFlint"), OreBracketHandler.getOre((String)"itemLeather"), OreBracketHandler.getOre((String)"itemFlint")}, {OreBracketHandler.getOre((String)"itemLeather"), ItemBracketHandler.getItem((String)"battlegear2:shield.wood", (int)0), OreBracketHandler.getOre((String)"itemLeather")}, {OreBracketHandler.getOre((String)"itemFlint"), OreBracketHandler.getOre((String)"itemLeather"), OreBracketHandler.getOre((String)"itemFlint")}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:shield.iron", (int)0), (IIngredient[][])new IIngredient[][]{{ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)2), ItemBracketHandler.getItem((String)"TConstruct:toughBinding", (int)2), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)2)}, {OreBracketHandler.getOre((String)"craftingToolHardHammer"), ItemBracketHandler.getItem((String)"TConstruct:toughRod", (int)2), OreBracketHandler.getOre((String)"craftingToolFile")}, {null, ItemBracketHandler.getItem((String)"TConstruct:toughRod", (int)2), null}}, null);
        IItemStack iItemStack = ItemBracketHandler.getItem((String)"battlegear2:shield.gold", (int)0);
        IIngredient[][] arrarriIngredient = new IIngredient[3][];
        IIngredient[] arriIngredient = new IIngredient[3];
        IItemStack iItemStack2 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartLargePlate", (int)1505);
        HashMap<String, IData> hashMap = new HashMap<String, IData>();
        hashMap.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient[0] = iItemStack2.withTag(ExpandAnyDict.asData(hashMap));
        IItemStack iItemStack3 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartToughBind", (int)1505);
        HashMap<String, IData> hashMap2 = new HashMap<String, IData>();
        hashMap2.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient[1] = iItemStack3.withTag(ExpandAnyDict.asData(hashMap2));
        IItemStack iItemStack4 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartLargePlate", (int)1505);
        HashMap<String, IData> hashMap3 = new HashMap<String, IData>();
        hashMap3.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient[2] = iItemStack4.withTag(ExpandAnyDict.asData(hashMap3));
        arrarriIngredient[0] = arriIngredient;
        IIngredient[] arriIngredient2 = new IIngredient[3];
        arriIngredient2[0] = OreBracketHandler.getOre((String)"craftingToolHardHammer");
        IItemStack iItemStack5 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartToughRod", (int)1505);
        HashMap<String, IData> hashMap4 = new HashMap<String, IData>();
        hashMap4.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient2[1] = iItemStack5.withTag(ExpandAnyDict.asData(hashMap4));
        arriIngredient2[2] = OreBracketHandler.getOre((String)"craftingToolFile");
        arrarriIngredient[1] = arriIngredient2;
        IIngredient[] arriIngredient3 = new IIngredient[3];
        arriIngredient3[0] = null;
        IItemStack iItemStack6 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartToughRod", (int)1505);
        HashMap<String, IData> hashMap5 = new HashMap<String, IData>();
        hashMap5.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient3[1] = iItemStack6.withTag(ExpandAnyDict.asData(hashMap5));
        arriIngredient3[2] = null;
        arrarriIngredient[2] = arriIngredient3;
        MineTweakerAPI.recipes.addShaped(iItemStack, (IIngredient[][])arrarriIngredient, null);
        IItemStack iItemStack7 = ItemBracketHandler.getItem((String)"battlegear2:shield.diamond", (int)0);
        IIngredient[][] arrarriIngredient2 = new IIngredient[3][];
        IIngredient[] arriIngredient4 = new IIngredient[3];
        IItemStack iItemStack8 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartLargePlate", (int)1594);
        HashMap<String, IData> hashMap6 = new HashMap<String, IData>();
        hashMap6.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient4[0] = iItemStack8.withTag(ExpandAnyDict.asData(hashMap6));
        IItemStack iItemStack9 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartToughBind", (int)1594);
        HashMap<String, IData> hashMap7 = new HashMap<String, IData>();
        hashMap7.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient4[1] = iItemStack9.withTag(ExpandAnyDict.asData(hashMap7));
        IItemStack iItemStack10 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartLargePlate", (int)1594);
        HashMap<String, IData> hashMap8 = new HashMap<String, IData>();
        hashMap8.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient4[2] = iItemStack10.withTag(ExpandAnyDict.asData(hashMap8));
        arrarriIngredient2[0] = arriIngredient4;
        IIngredient[] arriIngredient5 = new IIngredient[3];
        arriIngredient5[0] = OreBracketHandler.getOre((String)"craftingToolHardHammer");
        IItemStack iItemStack11 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartToughRod", (int)1594);
        HashMap<String, IData> hashMap9 = new HashMap<String, IData>();
        hashMap9.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient5[1] = iItemStack11.withTag(ExpandAnyDict.asData(hashMap9));
        arriIngredient5[2] = OreBracketHandler.getOre((String)"craftingToolFile");
        arrarriIngredient2[1] = arriIngredient5;
        IIngredient[] arriIngredient6 = new IIngredient[3];
        arriIngredient6[0] = null;
        IItemStack iItemStack12 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartToughRod", (int)1594);
        HashMap<String, IData> hashMap10 = new HashMap<String, IData>();
        hashMap10.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient6[1] = iItemStack12.withTag(ExpandAnyDict.asData(hashMap10));
        arriIngredient6[2] = null;
        arrarriIngredient2[2] = arriIngredient6;
        MineTweakerAPI.recipes.addShaped(iItemStack7, (IIngredient[][])arrarriIngredient2, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:dagger.wood", (int)0), (IIngredient[][])new IIngredient[][]{{ItemBracketHandler.getItem((String)"gregtech:gt.metaitem.01", (int)17809), OreBracketHandler.getOre((String)"craftingToolFile"), null}, {OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"craftingToolHardHammer"), null}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:dagger.stone", (int)0), (IIngredient[][])new IIngredient[][]{{OreBracketHandler.getOre((String)"plateStone"), OreBracketHandler.getOre((String)"craftingToolFile"), null}, {OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"craftingToolHardHammer"), null}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:dagger.iron", (int)0), (IIngredient[][])new IIngredient[][]{{OreBracketHandler.getOre((String)"plateAnyIron"), OreBracketHandler.getOre((String)"craftingToolFile"), null}, {OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"craftingToolHardHammer"), null}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:dagger.diamond", (int)0), (IIngredient[][])new IIngredient[][]{{OreBracketHandler.getOre((String)"plateDiamond"), OreBracketHandler.getOre((String)"craftingToolFile"), null}, {OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"craftingToolHardHammer"), null}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:spear.wood", (int)0), (IIngredient[][])new IIngredient[][]{{null, ItemBracketHandler.getItem((String)"minecraft:string", (int)0), OreBracketHandler.getOre((String)"stickWood")}, {ItemBracketHandler.getItem((String)"minecraft:string", (int)0), OreBracketHandler.getOre((String)"itemLeather"), ItemBracketHandler.getItem((String)"minecraft:string", (int)0)}, {OreBracketHandler.getOre((String)"stickWood"), ItemBracketHandler.getItem((String)"minecraft:string", (int)0), null}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:spear.stone", (int)0), (IIngredient[][])new IIngredient[][]{{OreBracketHandler.getOre((String)"screwAnyIron"), ItemBracketHandler.getItem((String)"TConstruct:arrowhead", (int)1), null}, {ItemBracketHandler.getItem((String)"battlegear2:spear.wood", (int)0), OreBracketHandler.getOre((String)"screwAnyIron"), null}, {OreBracketHandler.getOre((String)"craftingToolSaw"), OreBracketHandler.getOre((String)"craftingToolScrewdriver"), null}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:spear.iron", (int)0), (IIngredient[][])new IIngredient[][]{{OreBracketHandler.getOre((String)"screwSteel"), ItemBracketHandler.getItem((String)"TConstruct:arrowhead", (int)2), null}, {ItemBracketHandler.getItem((String)"battlegear2:spear.wood", (int)0), OreBracketHandler.getOre((String)"screwSteel"), null}, {OreBracketHandler.getOre((String)"craftingToolSaw"), OreBracketHandler.getOre((String)"craftingToolScrewdriver"), null}}, null);
        IItemStack iItemStack13 = ItemBracketHandler.getItem((String)"battlegear2:spear.gold", (int)0);
        IIngredient[][] arrarriIngredient3 = new IIngredient[3][];
        IIngredient[] arriIngredient7 = new IIngredient[3];
        arriIngredient7[0] = OreBracketHandler.getOre((String)"screwAluminium");
        IItemStack iItemStack14 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartArrowHead", (int)1505);
        HashMap<String, IData> hashMap11 = new HashMap<String, IData>();
        hashMap11.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient7[1] = iItemStack14.withTag(ExpandAnyDict.asData(hashMap11));
        arriIngredient7[2] = null;
        arrarriIngredient3[0] = arriIngredient7;
        arrarriIngredient3[1] = new IIngredient[]{ItemBracketHandler.getItem((String)"battlegear2:spear.wood", (int)0), OreBracketHandler.getOre((String)"screwAluminium"), null};
        arrarriIngredient3[2] = new IIngredient[]{OreBracketHandler.getOre((String)"craftingToolSaw"), OreBracketHandler.getOre((String)"craftingToolScrewdriver"), null};
        MineTweakerAPI.recipes.addShaped(iItemStack13, (IIngredient[][])arrarriIngredient3, null);
        IItemStack iItemStack15 = ItemBracketHandler.getItem((String)"battlegear2:spear.diamond", (int)0);
        IIngredient[][] arrarriIngredient4 = new IIngredient[3][];
        IIngredient[] arriIngredient8 = new IIngredient[3];
        arriIngredient8[0] = OreBracketHandler.getOre((String)"screwStainlessSteel");
        IItemStack iItemStack16 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartArrowHead", (int)1594);
        HashMap<String, IData> hashMap12 = new HashMap<String, IData>();
        hashMap12.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient8[1] = iItemStack16.withTag(ExpandAnyDict.asData(hashMap12));
        arriIngredient8[2] = null;
        arrarriIngredient4[0] = arriIngredient8;
        arrarriIngredient4[1] = new IIngredient[]{ItemBracketHandler.getItem((String)"battlegear2:spear.wood", (int)0), OreBracketHandler.getOre((String)"screwStainlessSteel"), null};
        arrarriIngredient4[2] = new IIngredient[]{OreBracketHandler.getOre((String)"craftingToolSaw"), OreBracketHandler.getOre((String)"craftingToolScrewdriver"), null};
        MineTweakerAPI.recipes.addShaped(iItemStack15, (IIngredient[][])arrarriIngredient4, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:waraxe.wood", (int)0), (IIngredient[][])new IIngredient[][]{{ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)0), OreBracketHandler.getOre((String)"craftingToolSoftHammer"), ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)0)}, {ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)0), OreBracketHandler.getOre((String)"stickWood"), ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)0)}, {null, OreBracketHandler.getOre((String)"stickWood"), null}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:waraxe.stone", (int)0), (IIngredient[][])new IIngredient[][]{{ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)1), OreBracketHandler.getOre((String)"craftingToolScrewdriver"), ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)1)}, {ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)1), OreBracketHandler.getOre((String)"stickWood"), ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)1)}, {OreBracketHandler.getOre((String)"screwAnyIron"), OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"screwAnyIron")}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:waraxe.iron", (int)0), (IIngredient[][])new IIngredient[][]{{ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)2), OreBracketHandler.getOre((String)"craftingToolScrewdriver"), ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)2)}, {ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)2), OreBracketHandler.getOre((String)"stickWood"), ItemBracketHandler.getItem((String)"TConstruct:hatchetHead", (int)2)}, {OreBracketHandler.getOre((String)"screwSteel"), OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"screwSteel")}}, null);
        IItemStack iItemStack17 = ItemBracketHandler.getItem((String)"battlegear2:waraxe.gold", (int)0);
        IIngredient[][] arrarriIngredient5 = new IIngredient[3][];
        IIngredient[] arriIngredient9 = new IIngredient[3];
        IItemStack iItemStack18 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartAxeHead", (int)1505);
        HashMap<String, IData> hashMap13 = new HashMap<String, IData>();
        hashMap13.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient9[0] = iItemStack18.withTag(ExpandAnyDict.asData(hashMap13));
        arriIngredient9[1] = OreBracketHandler.getOre((String)"craftingToolScrewdriver");
        IItemStack iItemStack19 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartAxeHead", (int)1505);
        HashMap<String, IData> hashMap14 = new HashMap<String, IData>();
        hashMap14.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient9[2] = iItemStack19.withTag(ExpandAnyDict.asData(hashMap14));
        arrarriIngredient5[0] = arriIngredient9;
        IIngredient[] arriIngredient10 = new IIngredient[3];
        IItemStack iItemStack20 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartAxeHead", (int)1505);
        HashMap<String, IData> hashMap15 = new HashMap<String, IData>();
        hashMap15.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient10[0] = iItemStack20.withTag(ExpandAnyDict.asData(hashMap15));
        arriIngredient10[1] = OreBracketHandler.getOre((String)"stickWood");
        IItemStack iItemStack21 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartAxeHead", (int)1505);
        HashMap<String, IData> hashMap16 = new HashMap<String, IData>();
        hashMap16.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient10[2] = iItemStack21.withTag(ExpandAnyDict.asData(hashMap16));
        arrarriIngredient5[1] = arriIngredient10;
        arrarriIngredient5[2] = new IIngredient[]{OreBracketHandler.getOre((String)"screwAluminium"), OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"screwAluminium")};
        MineTweakerAPI.recipes.addShaped(iItemStack17, (IIngredient[][])arrarriIngredient5, null);
        IItemStack iItemStack22 = ItemBracketHandler.getItem((String)"battlegear2:waraxe.diamond", (int)0);
        IIngredient[][] arrarriIngredient6 = new IIngredient[3][];
        IIngredient[] arriIngredient11 = new IIngredient[3];
        IItemStack iItemStack23 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartAxeHead", (int)1594);
        HashMap<String, IData> hashMap17 = new HashMap<String, IData>();
        hashMap17.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient11[0] = iItemStack23.withTag(ExpandAnyDict.asData(hashMap17));
        arriIngredient11[1] = OreBracketHandler.getOre((String)"craftingToolScrewdriver");
        IItemStack iItemStack24 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartAxeHead", (int)1594);
        HashMap<String, IData> hashMap18 = new HashMap<String, IData>();
        hashMap18.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient11[2] = iItemStack24.withTag(ExpandAnyDict.asData(hashMap18));
        arrarriIngredient6[0] = arriIngredient11;
        IIngredient[] arriIngredient12 = new IIngredient[3];
        IItemStack iItemStack25 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartAxeHead", (int)1594);
        HashMap<String, IData> hashMap19 = new HashMap<String, IData>();
        hashMap19.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient12[0] = iItemStack25.withTag(ExpandAnyDict.asData(hashMap19));
        arriIngredient12[1] = OreBracketHandler.getOre((String)"stickWood");
        IItemStack iItemStack26 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartAxeHead", (int)1594);
        HashMap<String, IData> hashMap20 = new HashMap<String, IData>();
        hashMap20.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient12[2] = iItemStack26.withTag(ExpandAnyDict.asData(hashMap20));
        arrarriIngredient6[1] = arriIngredient12;
        arrarriIngredient6[2] = new IIngredient[]{OreBracketHandler.getOre((String)"screwStainlessSteel"), OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"screwStainlessSteel")};
        MineTweakerAPI.recipes.addShaped(iItemStack22, (IIngredient[][])arrarriIngredient6, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:mace.wood", (int)0), (IIngredient[][])new IIngredient[][]{{null, ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)0), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)0)}, {null, ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)0), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)0)}, {OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"craftingToolSoftHammer"), null}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:mace.stone", (int)0), (IIngredient[][])new IIngredient[][]{{OreBracketHandler.getOre((String)"screwAnyIron"), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)1), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)1)}, {OreBracketHandler.getOre((String)"screwAnyIron"), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)1), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)1)}, {OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"craftingToolHardHammer"), OreBracketHandler.getOre((String)"craftingToolScrewdriver")}}, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:mace.iron", (int)0), (IIngredient[][])new IIngredient[][]{{OreBracketHandler.getOre((String)"screwSteel"), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)2), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)0)}, {OreBracketHandler.getOre((String)"screwSteel"), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)0), ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)2)}, {OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"craftingToolHardHammer"), OreBracketHandler.getOre((String)"craftingToolScrewdriver")}}, null);
        IItemStack iItemStack27 = ItemBracketHandler.getItem((String)"battlegear2:mace.gold", (int)0);
        IIngredient[][] arrarriIngredient7 = new IIngredient[3][];
        IIngredient[] arriIngredient13 = new IIngredient[3];
        arriIngredient13[0] = OreBracketHandler.getOre((String)"screwAluminium");
        IItemStack iItemStack28 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartLargePlate", (int)1505);
        HashMap<String, IData> hashMap21 = new HashMap<String, IData>();
        hashMap21.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient13[1] = iItemStack28.withTag(ExpandAnyDict.asData(hashMap21));
        arriIngredient13[2] = ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)1);
        arrarriIngredient7[0] = arriIngredient13;
        IIngredient[] arriIngredient14 = new IIngredient[3];
        arriIngredient14[0] = OreBracketHandler.getOre((String)"screwAluminium");
        arriIngredient14[1] = ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)1);
        IItemStack iItemStack29 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartLargePlate", (int)1505);
        HashMap<String, IData> hashMap22 = new HashMap<String, IData>();
        hashMap22.put("material", ExpandString.asData((String)"Gold"));
        arriIngredient14[2] = iItemStack29.withTag(ExpandAnyDict.asData(hashMap22));
        arrarriIngredient7[1] = arriIngredient14;
        arrarriIngredient7[2] = new IIngredient[]{OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"craftingToolHardHammer"), OreBracketHandler.getOre((String)"craftingToolScrewdriver")};
        MineTweakerAPI.recipes.addShaped(iItemStack27, (IIngredient[][])arrarriIngredient7, null);
        IItemStack iItemStack30 = ItemBracketHandler.getItem((String)"battlegear2:mace.diamond", (int)0);
        IIngredient[][] arrarriIngredient8 = new IIngredient[3][];
        IIngredient[] arriIngredient15 = new IIngredient[3];
        arriIngredient15[0] = OreBracketHandler.getOre((String)"screwStainlessSteel");
        IItemStack iItemStack31 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartLargePlate", (int)1594);
        HashMap<String, IData> hashMap23 = new HashMap<String, IData>();
        hashMap23.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient15[1] = iItemStack31.withTag(ExpandAnyDict.asData(hashMap23));
        arriIngredient15[2] = ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)2);
        arrarriIngredient8[0] = arriIngredient15;
        IIngredient[] arriIngredient16 = new IIngredient[3];
        arriIngredient16[0] = OreBracketHandler.getOre((String)"screwStainlessSteel");
        arriIngredient16[1] = ItemBracketHandler.getItem((String)"TConstruct:heavyPlate", (int)2);
        IItemStack iItemStack32 = ItemBracketHandler.getItem((String)"TGregworks:tGregToolPartLargePlate", (int)1594);
        HashMap<String, IData> hashMap24 = new HashMap<String, IData>();
        hashMap24.put("material", ExpandString.asData((String)"Diamond"));
        arriIngredient16[2] = iItemStack32.withTag(ExpandAnyDict.asData(hashMap24));
        arrarriIngredient8[1] = arriIngredient16;
        arrarriIngredient8[2] = new IIngredient[]{OreBracketHandler.getOre((String)"stickWood"), OreBracketHandler.getOre((String)"craftingToolHardHammer"), OreBracketHandler.getOre((String)"craftingToolScrewdriver")};
        MineTweakerAPI.recipes.addShaped(iItemStack30, (IIngredient[][])arrarriIngredient8, null);
        MineTweakerAPI.recipes.addShaped(ItemBracketHandler.getItem((String)"battlegear2:quiver", (int)0), (IIngredient[][])new IIngredient[][]{{OreBracketHandler.getOre((String)"itemLeather"), OreBracketHandler.getOre((String)"ringAnyIron"), OreBracketHandler.getOre((String)"itemLeather")}, {OreBracketHandler.getOre((String)"itemLeather"), ItemBracketHandler.getItem((String)"minecraft:string", (int)0), OreBracketHandler.getOre((String)"itemLeather")}, {ItemBracketHandler.getItem((String)"Backpack:tannedLeather", (int)0), OreBracketHandler.getOre((String)"itemLeather"), ItemBracketHandler.getItem((String)"Backpack:tannedLeather", (int)0)}}, null);
    }
}

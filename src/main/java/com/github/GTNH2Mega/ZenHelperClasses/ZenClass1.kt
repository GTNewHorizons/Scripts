package com.github.GTNH2Mega.ZenHelperClasses

import minetweaker.api.recipes.IRecipeFunction
import minetweaker.api.item.IItemStack
import minetweaker.api.recipes.ICraftingInfo

class ZenClass1 : IRecipeFunction {
    override fun process(iItemStack: IItemStack?, map: MutableMap<String, IItemStack>?, iCraftingInfo: ICraftingInfo?): IItemStack? {
        return map?.get("armor")?.withDamage(0)
    }
}
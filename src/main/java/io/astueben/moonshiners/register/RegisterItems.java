/*
 * Copyright (c) 2019 Alexander Stüben
 *
 * This file is part of Moonshiners.
 *
 * Moonshiners is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Moonshiners is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Moonshiners.  If not, see <https://www.gnu.org/licenses/>.
 */

package io.astueben.moonshiners.register;

import cpw.mods.fml.common.registry.GameRegistry;

import static io.astueben.moonshiners.init.InitItems.*;

public class RegisterItems {
    public static void Ingots() {
        GameRegistry.registerItem(ingotCopper, "copper_ingot");
    }

    public static void Swords() {
        GameRegistry.registerItem(swordCopper, "copper_sword");
    }

    public static void Axes() {
        GameRegistry.registerItem(axeCopper, "copper_axe");
    }

    public static void Pickaxes() {
        GameRegistry.registerItem(pickaxeCopper, "copper_pickaxe");
    }

    public static void Spades() {
        GameRegistry.registerItem(spadeCopper, "copper_shovel");
    }

    public static void Hoes() {
        GameRegistry.registerItem(hoeCopper, "copper_hoe");
    }
}

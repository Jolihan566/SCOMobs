
package net.mcreator.arpgentities.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.arpgentities.ArpgEntitiesModElements;

@ArpgEntitiesModElements.ModElement.Tag
public class SCOPainting1Painting extends ArpgEntitiesModElements.ModElement {
	public SCOPainting1Painting(ArpgEntitiesModElements instance) {
		super(instance, 6);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(30, 30).setRegistryName("sco_painting_1"));
	}
}

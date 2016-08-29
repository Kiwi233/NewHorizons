package com.dreammaster.item;

import net.minecraft.item.ItemStack;

import com.dreammaster.creativetab.ModTabList;
import com.dreammaster.lib.Refstrings;
import com.dreammaster.main.MainRegistry;

import eu.usrv.yamcore.items.ModItemManager;
import eu.usrv.yamcore.items.ModSimpleBaseItem;

public enum ItemList
{
    TenKCell(new ModSimpleBaseItem("TenKCell", ModTabList.ModGenericTab)),
    ThirtyKCell(new ModSimpleBaseItem("ThirtyKCell", ModTabList.ModGenericTab)),
    SixtyKCell(new ModSimpleBaseItem("SixtyKCell", ModTabList.ModGenericTab)),
    AluminiumBars(new ModSimpleBaseItem("AluminiumBars", ModTabList.ModBarsAndCasingsTab)),
    AluminiumItemCasing(new ModSimpleBaseItem("AluminiumItemCasing", ModTabList.ModBarsAndCasingsTab)),
    AluminiumIronPlate(new ModSimpleBaseItem("AluminiumIronPlate", ModTabList.ModSolarTab)),
    AdvancedCokeOvenBrick(new ModSimpleBaseItem("AdvancedCokeOvenBrick", ModTabList.ModGenericTab)),
    AdvancedProcessorBoard(new ModSimpleBaseItem("AdvancedProcessorBoard", ModTabList.ModCircuitsTab)),
    ApprenticeOrb(new ModSimpleBaseItem("ApprenticeOrb", ModTabList.ModThaumcraftTab)),
    ArcaneSlate(new ModSimpleBaseItem("ArcaneSlate", ModTabList.ModThaumcraftTab)),
    ArchmageOrb(new ModSimpleBaseItem("ArchmageOrb", ModTabList.ModThaumcraftTab)),
    ArditePlate(new ModSimpleBaseItem("ArditePlate", ModTabList.ModGenericTab)),
    AsteroidsStoneDust(new ModSimpleBaseItem("AsteroidsStoneDust", ModTabList.ModGenericTab)),
    BarnardaEStoneDust(new ModSimpleBaseItem("BarnardaEStoneDust", ModTabList.ModSpaceTab)),
    BarnardaFStoneDust(new ModSimpleBaseItem("BarnardaFStoneDust", ModTabList.ModSpaceTab)),
    BedrockiumPlate(new ModSimpleBaseItem("BedrockiumPlate", ModTabList.ModGenericTab)),
    BioCarbonPlate(new ModSimpleBaseItem("BioCarbonPlate", ModTabList.ModGenericTab)),
    BioBall(new ModSimpleBaseItem("BioBall", ModTabList.ModGenericTab)),
    BioOrganicMesh(new ModSimpleBaseItem("BioOrganicMesh", ModTabList.ModGenericTab)),
    BioChunk(new ModSimpleBaseItem("BioChunk", ModTabList.ModGenericTab)),
    Blaster(new ModSimpleBaseItem("Blaster", ModTabList.ModThaumcraftTab)),
    BowFletchingCast(new ModSimpleBaseItem("BowFletchingCast", ModTabList.ModMoldsTab)),
    BowStringCast(new ModSimpleBaseItem("BowStringCast", ModTabList.ModMoldsTab)),
    CompressedBioBall(new ModSimpleBaseItem("CompressedBioBall", ModTabList.ModGenericTab)),
    BlackPlutoniumCompressedPlate(new ModSimpleBaseItem("BlackPlutoniumCompressedPlate", ModTabList.ModSpaceTab)),
    BlackPlutoniumDust(new ModSimpleBaseItem("BlackPlutoniumDust", ModTabList.ModSpaceTab)),
    BlackPlutoniumPlate(new ModSimpleBaseItem("BlackPlutoniumPlate", ModTabList.ModSpaceTab)),
    BlackPlutoniumDensePlate(new ModSimpleBaseItem("BlackPlutoniumDensePlate", ModTabList.ModSpaceTab)),
    BlankPlatedChip(new ModSimpleBaseItem("BlankPlatedChip", ModTabList.ModCircuitsTab)),
    CallistoIceDust(new ModSimpleBaseItem("CallistoIceDust", ModTabList.ModSpaceTab)),
    CallistoIceIngot(new ModSimpleBaseItem("CallistoIceIngot", ModTabList.ModSpaceTab)),
    CallistoIceColdIngot(new ModSimpleBaseItem("CallistoIceColdIngot", ModTabList.ModSpaceTab)),
    CallistoIcePlate(new ModSimpleBaseItem("CallistoIcePlate", ModTabList.ModSpaceTab)),
    CallistoIceDensePlate(new ModSimpleBaseItem("CallistoIceDensePlate", ModTabList.ModSpaceTab)),
    CallistoIceCompressedPlate(new ModSimpleBaseItem("CallistoIceCompressedPlate", ModTabList.ModSpaceTab)),
    CallistoStoneDust(new ModSimpleBaseItem("CallistoStoneDust", ModTabList.ModSpaceTab)),
    CarbonPartBoots(new ModSimpleBaseItem("CarbonPartBoots", ModTabList.ModGenericTab)),
    CarbonPartChestplate(new ModSimpleBaseItem("CarbonPartChestplate", ModTabList.ModGenericTab)),
    CarbonPartHelmet(new ModSimpleBaseItem("CarbonPartHelmet", ModTabList.ModGenericTab)),
    CarbonPartHelmetNightVision(new ModSimpleBaseItem("CarbonPartHelmetNightVision", ModTabList.ModGenericTab)),
    CarbonPartLeggings(new ModSimpleBaseItem("CarbonPartLeggings", ModTabList.ModGenericTab)),
    CarminiteChip(new ModSimpleBaseItem("CarminiteChip", ModTabList.ModThaumcraftTab)),
    CarminiteFragment(new ModSimpleBaseItem("CarminiteFragment", ModTabList.ModThaumcraftTab)),
    CentauriAStoneDust(new ModSimpleBaseItem("CentauriAStoneDust", ModTabList.ModSpaceTab)),
    CeresStoneDust(new ModSimpleBaseItem("CeresStoneDust", ModTabList.ModSpaceTab)),
    ChargedSilverWandCap(new ModSimpleBaseItem("ChargedSilverWandCap", ModTabList.ModThaumcraftTab)),
    ChargedThaumiumWandCap(new ModSimpleBaseItem("ChargedThaumiumWandCap", ModTabList.ModThaumcraftTab)),
    ChargedVoidWandCap(new ModSimpleBaseItem("ChargedVoidWandCap", ModTabList.ModThaumcraftTab)),
    ChargedCertusQuartzDust(new ModSimpleBaseItem("ChargedCertusQuartzDust", ModTabList.ModGenericTab)),
    ChargedCertusQuartzPlate(new ModSimpleBaseItem("ChargedCertusQuartzPlate", ModTabList.ModGenericTab)),
    ChargedCertusQuartzRod(new ModSimpleBaseItem("ChargedCertusQuartzRod", ModTabList.ModGenericTab)),
    CoinChunkloaderTierI(new ModSimpleBaseItem("CoinChunkloaderTierI", ModTabList.ModGenericTab)),
    CoinChunkloaderTierII(new ModSimpleBaseItem("CoinChunkloaderTierII", ModTabList.ModGenericTab)),
    CoinChunkloaderTierIII(new ModSimpleBaseItem("CoinChunkloaderTierIII", ModTabList.ModGenericTab)),
    CoinDarkWizard(new ModSimpleBaseItem("CoinDarkWizard", ModTabList.ModGenericTab)),
    CoinTechnician(new ModSimpleBaseItem("CoinTechnician", ModTabList.ModGenericTab)),
    CokeOvenBrick(new ModSimpleBaseItem("CokeOvenBrick", ModTabList.ModGenericTab)),
    ConductiveIronBars(new ModSimpleBaseItem("ConductiveIronBars", ModTabList.ModBarsAndCasingsTab)),
    CopperDualCompressedPlates(new ModSimpleBaseItem("CopperDualCompressedPlates", ModTabList.ModSpaceTab)),
    ChromeBars(new ModSimpleBaseItem("ChromeBars", ModTabList.ModBarsAndCasingsTab)),
    ChromeItemCasing(new ModSimpleBaseItem("ChromeItemCasing", ModTabList.ModBarsAndCasingsTab)),
    ChromeIronPlate(new ModSimpleBaseItem("ChromeIronPlate", ModTabList.ModSolarTab)),
    CobbleStoneRod(new ModSimpleBaseItem("CobbleStoneRod", ModTabList.ModGenericTab)),
    CopperWandCap(new ModSimpleBaseItem("CopperWandCap", ModTabList.ModThaumcraftTab)),
    DeimosStoneDust(new ModSimpleBaseItem("DeimosStoneDust", ModTabList.ModSpaceTab)),
    DeshDualCompressedPlates(new ModSimpleBaseItem("DeshDualCompressedPlates", ModTabList.ModSpaceTab)),
    Display(new ModSimpleBaseItem("Display", ModTabList.ModCircuitsTab)),
    DiamondCoreChip(new ModSimpleBaseItem("DiamondCoreChip", ModTabList.ModCircuitsTab)),
    DiamondDrillTip(new ModSimpleBaseItem("DiamondDrillTip", ModTabList.ModGenericTab)),
    DiamondFluidCoreChip(new ModSimpleBaseItem("DiamondFluidCoreChip", ModTabList.ModCircuitsTab)),
    ElectricalSteelBars(new ModSimpleBaseItem("ElectricalSteelBars", ModTabList.ModBarsAndCasingsTab)),
    ElectricBoatHull(new ModSimpleBaseItem("ElectricBoatHull", ModTabList.ModGenericTab)),
    ElectrotineWire(new ModSimpleBaseItem("ElectrotineWire", ModTabList.ModGenericTab)),
    EmeraldAdvancedCoreChip(new ModSimpleBaseItem("EmeraldAdvancedCoreChip", ModTabList.ModCircuitsTab)),
    EmeraldAdvancedFluidCoreChip(new ModSimpleBaseItem("EmeraldAdvancedFluidCoreChip", ModTabList.ModCircuitsTab)),
    EmeraldHighAdvancedCoreChip(new ModSimpleBaseItem("EmeraldHighAdvancedCoreChip", ModTabList.ModCircuitsTab)),
    EnceladusIceDust(new ModSimpleBaseItem("EnceladusIceDust", ModTabList.ModSpaceTab)),
    EnceladusStoneDust(new ModSimpleBaseItem("EnceladusStoneDust", ModTabList.ModSpaceTab)),
    EnderiumBaseBars(new ModSimpleBaseItem("EnderiumBaseBars", ModTabList.ModBarsAndCasingsTab)),
    EnderiumBars(new ModSimpleBaseItem("EnderiumBars", ModTabList.ModBarsAndCasingsTab)),
    EnergeticAlloyBars(new ModSimpleBaseItem("EnergeticAlloyBars", ModTabList.ModBarsAndCasingsTab)),
    EngineeringProcessorEssentiaPulsatingCore(new ModSimpleBaseItem("EngineeringProcessorEssentiaPulsatingCore", ModTabList.ModCircuitsTab)),
    EngineeringProcessorFluidDiamondCore(new ModSimpleBaseItem("EngineeringProcessorFluidDiamondCore", ModTabList.ModCircuitsTab)),
    EngineeringProcessorFluidEmeraldCore(new ModSimpleBaseItem("EngineeringProcessorFluidEmeraldCore", ModTabList.ModCircuitsTab)),
    EngineeringProcessorItemAdvEmeraldCore(new ModSimpleBaseItem("EngineeringProcessorItemAdvEmeraldCore", ModTabList.ModCircuitsTab)),
    EngineeringProcessorItemEmeraldCore(new ModSimpleBaseItem("EngineeringProcessorItemEmeraldCore", ModTabList.ModCircuitsTab)),
    EngineeringProcessorItemDiamondCore(new ModSimpleBaseItem("EngineeringProcessorItemDiamondCore", ModTabList.ModCircuitsTab)),
    EngineeringProcessorSpatialPulsatingCore(new ModSimpleBaseItem("EngineeringProcessorSpatialPulsatingCore", ModTabList.ModCircuitsTab)),
    EngineCore(new ModSimpleBaseItem("EngineCore", ModTabList.ModGenericTab)),
    EngravedEnergyChip(new ModSimpleBaseItem("EngravedEnergyChip", ModTabList.ModCircuitsTab)),
    EngravedDiamondCrystalChip(new ModSimpleBaseItem("EngravedDiamondCrystalChip", ModTabList.ModCircuitsTab)),
    EngravedGoldChip(new ModSimpleBaseItem("EngravedGoldChip", ModTabList.ModCircuitsTab)),
    EngravedManyullynCrystalChip(new ModSimpleBaseItem("EngravedManyullynCrystalChip", ModTabList.ModCircuitsTab)),
    EngravedQuantumChip(new ModSimpleBaseItem("EngravedQuantumChip", ModTabList.ModCircuitsTab)),
    EnrichedNaquadriaSunnariumAlloy(new ModSimpleBaseItem("EnrichedNaquadriaSunnariumAlloy", ModTabList.ModSolarTab)),
    EnrichedNaquadriaNeutroniumSunnariumAlloy(new ModSimpleBaseItem("EnrichedNaquadriaNeutroniumSunnariumAlloy", ModTabList.ModSolarTab)),
    EnvironmentalCircuit(new ModSimpleBaseItem("EnvironmentalCircuit", ModTabList.ModCircuitsTab)),
    EssentiaCircuit(new ModSimpleBaseItem("EssentiaCircuit", ModTabList.ModCircuitsTab)),
    EtchedLowVoltageWiring(new ModSimpleBaseItem("EtchedLowVoltageWiring", ModTabList.ModCircuitsTab)),
    EtchedInsaneVoltageWiring(new ModSimpleBaseItem("EtchedInsaneVoltageWiring", ModTabList.ModCircuitsTab)),
    EtchedLudicrousVoltageWiring(new ModSimpleBaseItem("EtchedLudicrousVoltageWiring", ModTabList.ModCircuitsTab)),
    EuropaIceDust(new ModSimpleBaseItem("EuropaIceDust", ModTabList.ModSpaceTab)),
    EuropaStoneDust(new ModSimpleBaseItem("EuropaStoneDust", ModTabList.ModSpaceTab)),
    ExtraLargeFuelCanister(new ModSimpleBaseItem("ExtraLargeFuelCanister", ModTabList.ModSpaceTab)),
    ExtruderShapeBoat(new ModSimpleBaseItem("ExtruderShapeBoat", ModTabList.ModShapesTab)),
    FieryBloodDrop(new ModSimpleBaseItem("FieryBloodDrop", ModTabList.ModThaumcraftTab)),
    GanymedStoneDust(new ModSimpleBaseItem("GanymedStoneDust", ModTabList.ModSpaceTab)),
    GeneticCircuit(new ModSimpleBaseItem("GeneticCircuit", ModTabList.ModCircuitsTab)),
    GlowingMarshmallow(new ModSimpleBaseItem("GlowingMarshmallow", ModTabList.ModThaumcraftTab)),
    GoldCoreChip(new ModSimpleBaseItem("GoldCoreChip", ModTabList.ModCircuitsTab)),
    GoldWandCap(new ModSimpleBaseItem("GoldWandCap", ModTabList.ModThaumcraftTab)),
    HeavyDutyAlloyIngotT4(new ModSimpleBaseItem("HeavyDutyAlloyIngotT4", ModTabList.ModSpaceTab)),
    HeavyDutyAlloyIngotT5(new ModSimpleBaseItem("HeavyDutyAlloyIngotT5", ModTabList.ModSpaceTab)),
    HeavyDutyAlloyIngotT6(new ModSimpleBaseItem("HeavyDutyAlloyIngotT6", ModTabList.ModSpaceTab)),
    HeavyDutyAlloyIngotT7(new ModSimpleBaseItem("HeavyDutyAlloyIngotT7", ModTabList.ModSpaceTab)),
    HeavyDutyAlloyIngotT8(new ModSimpleBaseItem("HeavyDutyAlloyIngotT8", ModTabList.ModSpaceTab)),
    HeavyDutyAlloyIngotT9(new ModSimpleBaseItem("HeavyDutyAlloyIngotT9", ModTabList.ModSpaceTab)),
    HeavyDutyNoseConeTier3(new ModSimpleBaseItem("HeavyDutyNoseConeTier3", ModTabList.ModSpaceTab)),
    HeavyDutyNoseConeTier4(new ModSimpleBaseItem("HeavyDutyNoseConeTier4", ModTabList.ModSpaceTab)),
    HeavyDutyPlateTier4(new ModSimpleBaseItem("HeavyDutyPlateTier4", ModTabList.ModSpaceTab)),
    HeavyDutyPlateTier5(new ModSimpleBaseItem("HeavyDutyPlateTier5", ModTabList.ModSpaceTab)),
    HeavyDutyPlateTier6(new ModSimpleBaseItem("HeavyDutyPlateTier6", ModTabList.ModSpaceTab)),
    HeavyDutyPlateTier7(new ModSimpleBaseItem("HeavyDutyPlateTier7", ModTabList.ModSpaceTab)),
    HeavyDutyPlateTier8(new ModSimpleBaseItem("HeavyDutyPlateTier8", ModTabList.ModSpaceTab)),
    HeavyDutyRocketEngineTier3(new ModSimpleBaseItem("HeavyDutyRocketEngineTier3", ModTabList.ModSpaceTab)),
    HeavyDutyRocketEngineTier4(new ModSimpleBaseItem("HeavyDutyRocketEngineTier4", ModTabList.ModSpaceTab)),
    HeavyDutyRocketFinsTier3(new ModSimpleBaseItem("HeavyDutyRocketFinsTier3", ModTabList.ModSpaceTab)),
    HeavyDutyRocketFinsTier4(new ModSimpleBaseItem("HeavyDutyRocketFinsTier4", ModTabList.ModSpaceTab)),
    HighEnergyCircuitParts(new ModSimpleBaseItem("HighEnergyCircuitParts", ModTabList.ModCircuitsTab)),
    HighEnergyFlowCircuit(new ModSimpleBaseItem("HighEnergyFlowCircuit", ModTabList.ModCircuitsTab)),
    IceCompressedPlate(new ModSimpleBaseItem("IceCompressedPlate", ModTabList.ModSpaceTab)),
    IceDualCompressedPlates(new ModSimpleBaseItem("IceDualCompressedPlates", ModTabList.ModSpaceTab)),
    IchoriumCap(new ModSimpleBaseItem("IchoriumCap", ModTabList.ModThaumcraftTab)),
    InfernalBrick(new ModSimpleBaseItem("InfernalBrick", ModTabList.ModGenericTab)),
    IoStoneDust(new ModSimpleBaseItem("IoStoneDust", ModTabList.ModSpaceTab)),
    IridiumItemCasing(new ModSimpleBaseItem("IridiumItemCasing", ModTabList.ModBarsAndCasingsTab)),
    IridiumBars(new ModSimpleBaseItem("IridiumBars", ModTabList.ModBarsAndCasingsTab)),
    IridiumAlloyItemCasing(new ModSimpleBaseItem("IridiumAlloyItemCasing", ModTabList.ModBarsAndCasingsTab)),
    IrradiantReinforcedAluminiumPlate(new ModSimpleBaseItem("IrradiantReinforcedAluminiumPlate", ModTabList.ModSolarTab)),
    IrradiantReinforcedChromePlate(new ModSimpleBaseItem("IrradiantReinforcedChromePlate", ModTabList.ModSolarTab)),
    IrradiantReinforcedNaquadriaPlate(new ModSimpleBaseItem("IrradiantReinforcedNaquadriaPlate", ModTabList.ModSolarTab)),
    IrradiantReinforcedNeutroniumPlate(new ModSimpleBaseItem("IrradiantReinforcedNeutroniumPlate", ModTabList.ModSolarTab)),
    IrradiantReinforcedTitaniumPlate(new ModSimpleBaseItem("IrradiantReinforcedTitaniumPlate", ModTabList.ModSolarTab)),
    IrradiantReinforcedTungstenPlate(new ModSimpleBaseItem("IrradiantReinforcedTungstenPlate", ModTabList.ModSolarTab)),
    IrradiantReinforcedTungstenSteelPlate(new ModSimpleBaseItem("IrradiantReinforcedTungstenSteelPlate", ModTabList.ModSolarTab)),
    IronWandCap(new ModSimpleBaseItem("IronWandCap", ModTabList.ModThaumcraftTab)),
    IronDualCompressedPlates(new ModSimpleBaseItem("IronDualCompressedPlates", ModTabList.ModSpaceTab)),
    HaumeaStoneDust(new ModSimpleBaseItem("HaumeaStoneDust", ModTabList.ModSpaceTab)),
    HotNetherrackBrick(new ModSimpleBaseItem("HotNetherrackBrick", ModTabList.ModGenericTab)),
    LargeFuelCanister(new ModSimpleBaseItem("LargeFuelCanister", ModTabList.ModSpaceTab)),
    LaserEmitter(new ModSimpleBaseItem("LaserEmitter", ModTabList.ModGenericTab)),
    LeadNickelPlate(new ModSimpleBaseItem("LeadNickelPlate", ModTabList.ModSpaceTab)),
    LeadOriharukonPlate(new ModSimpleBaseItem("LeadOriharukonPlate", ModTabList.ModSpaceTab)),
    LedoxDust(new ModSimpleBaseItem("LedoxDust", ModTabList.ModSpaceTab)),
    LedoxIngot(new ModSimpleBaseItem("LedoxIngot", ModTabList.ModSpaceTab)),
    LedoxColdIngot(new ModSimpleBaseItem("LedoxColdIngot", ModTabList.ModSpaceTab)),
    LedoxPlate(new ModSimpleBaseItem("LedoxPlate", ModTabList.ModSpaceTab)),
    LedoxDensePlate(new ModSimpleBaseItem("LedoxDensePlate", ModTabList.ModSpaceTab)),
    LedoxCompressedPlate(new ModSimpleBaseItem("LedoxCompressedPlate", ModTabList.ModSpaceTab)),
    LichBone(new ModSimpleBaseItem("LichBone", ModTabList.ModThaumcraftTab)),
    LichBoneChip(new ModSimpleBaseItem("LichBoneChip", ModTabList.ModThaumcraftTab)),
    LichBoneFragment(new ModSimpleBaseItem("LichBoneFragment", ModTabList.ModThaumcraftTab)),
    LogicProcessorItemGoldCore(new ModSimpleBaseItem("LogicProcessorItemGoldCore", ModTabList.ModCircuitsTab)),
    LightShaft(new ModSimpleBaseItem("LightShaft", ModTabList.ModSpaceTab)),
    LightBinding(new ModSimpleBaseItem("LightBinding", ModTabList.ModSpaceTab)),
    LightAxeHead(new ModSimpleBaseItem("LightAxeHead", ModTabList.ModSpaceTab)),
    LightPickaxeHead(new ModSimpleBaseItem("LightPickaxeHead", ModTabList.ModSpaceTab)),
    LightSwordBlade(new ModSimpleBaseItem("LightSwordBlade", ModTabList.ModSpaceTab)),
    LongObsidianRod(new ModSimpleBaseItem("LongObsidianRod", ModTabList.ModGenericTab)),
    LongStoneRod(new ModSimpleBaseItem("LongStoneRod", ModTabList.ModGenericTab)),
    MagicianOrb(new ModSimpleBaseItem("MagicianOrb", ModTabList.ModThaumcraftTab)),
    ManyullynPlate(new ModSimpleBaseItem("ManyullynPlate", ModTabList.ModGenericTab)),
    MarsStoneDust(new ModSimpleBaseItem("MarsStoneDust", ModTabList.ModSpaceTab)),
    NanoCircuit(new ModSimpleBaseItem("NanoCircuit", ModTabList.ModCircuitsTab)),
    MakeMakeStoneDust(new ModSimpleBaseItem("MakeMakeStoneDust", ModTabList.ModSpaceTab)),
    MalformedSlush(new ModSimpleBaseItem("MalformedSlush", ModTabList.ModThaumcraftTab)),
    Marshmallow(new ModSimpleBaseItem("Marshmallow", ModTabList.ModThaumcraftTab)),
    ManyullynCrystal(new ModSimpleBaseItem("ManyullynCrystal", ModTabList.ModGenericTab)),
    MarshmallowForm(new ModSimpleBaseItem("MarshmallowForm", ModTabList.ModThaumcraftTab)),
    MarshmallowFormMold(new ModSimpleBaseItem("MarshmallowFormMold", ModTabList.ModThaumcraftTab)),
    MasterOrb(new ModSimpleBaseItem("MasterOrb", ModTabList.ModThaumcraftTab)),
    MediumFuelCanister(new ModSimpleBaseItem("MediumFuelCanister", ModTabList.ModSpaceTab)),
    MercuryCoreDust(new ModSimpleBaseItem("MercuryCoreDust", ModTabList.ModSpaceTab)),
    MercuryStoneDust(new ModSimpleBaseItem("MercuryStoneDust", ModTabList.ModSpaceTab)),
    MeteoricIronString(new ModSimpleBaseItem("MeteoricIronString", ModTabList.ModSpaceTab)),
    MeteoricIronDualCompressedPlates(new ModSimpleBaseItem("MeteoricIronDualCompressedPlates", ModTabList.ModSpaceTab)),
    MoldChestplate(new ModSimpleBaseItem("MoldChestplate", ModTabList.ModMoldsTab)),
    MoldHelmet(new ModSimpleBaseItem("MoldHelmet", ModTabList.ModMoldsTab)),
    MoldLeggings(new ModSimpleBaseItem("MoldLeggings", ModTabList.ModMoldsTab)),
    MoldFromLeggings(new ModSimpleBaseItem("MoldFormLeggings", ModTabList.ModMoldsTab)),
    MoldFromHelmet(new ModSimpleBaseItem("MoldFormHelmet", ModTabList.ModMoldsTab)),
    MoldFromChestplate(new ModSimpleBaseItem("MoldFormChestplate", ModTabList.ModMoldsTab)),
    MoldFromBoots(new ModSimpleBaseItem("MoldFormBoots", ModTabList.ModMoldsTab)),
    MoldBoots(new ModSimpleBaseItem("MoldBoots", ModTabList.ModMoldsTab)),
    MoldFormAnvil(new ModSimpleBaseItem("MoldFormAnvil", ModTabList.ModMoldsTab)),
    MoldFormArrowHead(new ModSimpleBaseItem("MoldFormArrowHead", ModTabList.ModMoldsTab)),
    MoldFormBaguette(new ModSimpleBaseItem("MoldFormBaguette", ModTabList.ModMoldsTab)),
    MoldFormBall(new ModSimpleBaseItem("MoldFormBall", ModTabList.ModMoldsTab)),
    MoldFormBlock(new ModSimpleBaseItem("MoldFormBlock", ModTabList.ModMoldsTab)),
    MoldFormBottle(new ModSimpleBaseItem("MoldFormBottle", ModTabList.ModMoldsTab)),
    MoldFormBread(new ModSimpleBaseItem("MoldFormBread", ModTabList.ModMoldsTab)),
    MoldFormBuns(new ModSimpleBaseItem("MoldFormBuns", ModTabList.ModMoldsTab)),
    MoldFormCasing(new ModSimpleBaseItem("MoldFormCasing", ModTabList.ModMoldsTab)),
    MoldFormCoinage(new ModSimpleBaseItem("MoldFormCoinage", ModTabList.ModMoldsTab)),
    MoldFormCylinder(new ModSimpleBaseItem("MoldFormCylinder", ModTabList.ModMoldsTab)),
    MoldFormGear(new ModSimpleBaseItem("MoldFormGear", ModTabList.ModMoldsTab)),
    MoldFormIngot(new ModSimpleBaseItem("MoldFormIngot", ModTabList.ModMoldsTab)),
    MoldFormName(new ModSimpleBaseItem("MoldFormName", ModTabList.ModMoldsTab)),
    MoldFormNuggets(new ModSimpleBaseItem("MoldFormNuggets", ModTabList.ModMoldsTab)),
    MoldFormPlate(new ModSimpleBaseItem("MoldFormPlate", ModTabList.ModMoldsTab)),
    MoldFormSmallGear(new ModSimpleBaseItem("MoldFormSmallGear", ModTabList.ModMoldsTab)),
    MoonStoneDust(new ModSimpleBaseItem("MoonStoneDust", ModTabList.ModGenericTab)),
    MushroomPowder(new ModSimpleBaseItem("MushroomPowder", ModTabList.ModGenericTab)),
    MysteriousCrystal(new ModSimpleBaseItem("MysteriousCrystal", ModTabList.ModSpaceTab)),
    MysteriousCrystalDust(new ModSimpleBaseItem("MysteriousCrystalDust", ModTabList.ModSpaceTab)),
    MysteriousCrystalIngot(new ModSimpleBaseItem("MysteriousCrystalIngot", ModTabList.ModSpaceTab)),
    MysteriousCrystalColdIngot(new ModSimpleBaseItem("MysteriousCrystalColdIngot", ModTabList.ModSpaceTab)),
    MysteriousCrystalPlate(new ModSimpleBaseItem("MysteriousCrystalPlate", ModTabList.ModSpaceTab)),
    MysteriousCrystalDensePlate(new ModSimpleBaseItem("MysteriousCrystalDensePlate", ModTabList.ModSpaceTab)),
    MysteriousCrystalCompressedPlate(new ModSimpleBaseItem("MysteriousCrystalCompressedPlate", ModTabList.ModSpaceTab)),
    MysteriousCrystalDualCompressedPlates(new ModSimpleBaseItem("MysteriousCrystalDualCompressedPlates", ModTabList.ModSpaceTab)),
    MytrylCrystal(new ModSimpleBaseItem("MytrylCrystal", ModTabList.ModSpaceTab)),
    MytrylDust(new ModSimpleBaseItem("MytrylDust", ModTabList.ModSpaceTab)),
    MytrylIngot(new ModSimpleBaseItem("MytrylIngot", ModTabList.ModSpaceTab)),
    MytrylHotIngot(new ModSimpleBaseItem("MytrylHotIngot", ModTabList.ModSpaceTab)),
    MytrylPlate(new ModSimpleBaseItem("MytrylPlate", ModTabList.ModSpaceTab)),
    MytrylDensePlate(new ModSimpleBaseItem("MytrylDensePlate", ModTabList.ModSpaceTab)),
    MytrylCompressedPlate(new ModSimpleBaseItem("MytrylCompressedPlate", ModTabList.ModSpaceTab)),
    MytrylDualCompressedPlates(new ModSimpleBaseItem("MytrylDualCompressedPlates", ModTabList.ModSpaceTab)),
    NagaScaleChip(new ModSimpleBaseItem("NagaScaleChip", ModTabList.ModThaumcraftTab)),
    NagaScaleFragment(new ModSimpleBaseItem("NagaScaleFragment", ModTabList.ModThaumcraftTab)),
    NanoCrystal(new ModSimpleBaseItem("NanoCrystal", ModTabList.ModCircuitsTab)),
    NanoProcessorBoard(new ModSimpleBaseItem("NanoProcessorBoard", ModTabList.ModCircuitsTab)),
    NanoChestJetPack(new ModSimpleBaseItem("NanoChestJetPack", ModTabList.ModGenericTab)),
    NanoPlatedLeggings(new ModSimpleBaseItem("NanoPlatedLeggings", ModTabList.ModGenericTab)),
    NanoRubberBoots(new ModSimpleBaseItem("NanoRubberBoots", ModTabList.ModGenericTab)),
    NanoScubaHelmet(new ModSimpleBaseItem("NanoScubaHelmet", ModTabList.ModGenericTab)),
    NaquadriaIronPlate(new ModSimpleBaseItem("NaquadriaIronPlate", ModTabList.ModSolarTab)),
    NeutroniumBars(new ModSimpleBaseItem("NeutroniumBars", ModTabList.ModBarsAndCasingsTab)),
    NeutroniumItemCasing(new ModSimpleBaseItem("NeutroniumItemCasing", ModTabList.ModBarsAndCasingsTab)),
    NeutroniumIronPlate(new ModSimpleBaseItem("NeutroniumIronPlate", ModTabList.ModSolarTab)),
    NeutronReflectorParts(new ModSimpleBaseItem("NeutronReflectorParts", ModTabList.ModCircuitsTab)),
    NetherStarFragment(new ModSimpleBaseItem("NetherStarFragment", ModTabList.ModGenericTab)),
    Nothing(new ModSimpleBaseItem("Nothing", ModTabList.ModGenericTab)),
    PikoCircuit(new ModSimpleBaseItem("PikoCircuit", ModTabList.ModCircuitsTab)),
    PistonPlate(new ModSimpleBaseItem("PistonPlate", ModTabList.ModGenericTab)),
    PhobosStoneDust(new ModSimpleBaseItem("PhobosStoneDust", ModTabList.ModSpaceTab)),
    PlutoIceDust(new ModSimpleBaseItem("PlutoIceDust", ModTabList.ModSpaceTab)),
    PlutoStoneDust(new ModSimpleBaseItem("PlutoStoneDust", ModTabList.ModSpaceTab)),
    PotassiumHydroxideDust(new ModSimpleBaseItem("PotassiumHydroxideDust", ModTabList.ModGenericTab)),
    ProteusStoneDust(new ModSimpleBaseItem("ProteusStoneDust", ModTabList.ModSpaceTab)),
    PulsatingIronBars(new ModSimpleBaseItem("PulsatingIronBars", ModTabList.ModBarsAndCasingsTab)),
    PulsatingSpatialCoreChip(new ModSimpleBaseItem("PulsatingSpatialCoreChip", ModTabList.ModCircuitsTab)),
    OberonStoneDust(new ModSimpleBaseItem("OberonStoneDust", ModTabList.ModSpaceTab)),
    OsmiumItemCasing(new ModSimpleBaseItem("OsmiumItemCasing", ModTabList.ModBarsAndCasingsTab)),
    OsmiumBars(new ModSimpleBaseItem("OsmiumBars", ModTabList.ModBarsAndCasingsTab)),
    QuantinumDust(new ModSimpleBaseItem("QuantinumDust", ModTabList.ModSpaceTab)),
    QuantinumHotIngot(new ModSimpleBaseItem("QuantinumHotIngot", ModTabList.ModSpaceTab)),
    QuantinumPlate(new ModSimpleBaseItem("QuantinumPlate", ModTabList.ModSpaceTab)),
    QuantinumDensePlate(new ModSimpleBaseItem("QuantinumDensePlate", ModTabList.ModSpaceTab)),
    QuantinumCompressedPlate(new ModSimpleBaseItem("QuantinumCompressedPlate", ModTabList.ModSpaceTab)),
    QuantinumDualCompressedPlates(new ModSimpleBaseItem("QuantinumDualCompressedPlates", ModTabList.ModSpaceTab)),
    QuantinumRod(new ModSimpleBaseItem("QuantinumRod", ModTabList.ModSpaceTab)),
    QuantumCircuit(new ModSimpleBaseItem("QuantumCircuit", ModTabList.ModCircuitsTab)),
    QuantumCrystal(new ModSimpleBaseItem("QuantumCrystal", ModTabList.ModCircuitsTab)),
    QuantumPartBoots(new ModSimpleBaseItem("QuantumPartBoots", ModTabList.ModGenericTab)),
    QuantumPartChestplate(new ModSimpleBaseItem("QuantumPartChestplate", ModTabList.ModGenericTab)),
    QuantumPartHelmet(new ModSimpleBaseItem("QuantumPartHelmet", ModTabList.ModGenericTab)),
    QuantumPartHelmetEmpty(new ModSimpleBaseItem("QuantumPartHelmetEmpty", ModTabList.ModGenericTab)),
    QuantumPartLeggings(new ModSimpleBaseItem("QuantumPartLeggings", ModTabList.ModGenericTab)),
    QuantumProcessorBoard(new ModSimpleBaseItem("QuantumProcessorBoard", ModTabList.ModCircuitsTab)),
    RawBioFiber(new ModSimpleBaseItem("RawBioFiber", ModTabList.ModGenericTab)),
    RawMytryl(new ModSimpleBaseItem("RawMytryl", ModTabList.ModSpaceTab)),
    RawOrbTier1(new ModSimpleBaseItem("RawOrbTier1", ModTabList.ModThaumcraftTab)),
    RawOrbTier2(new ModSimpleBaseItem("RawOrbTier2", ModTabList.ModThaumcraftTab)),
    RawOrbTier3(new ModSimpleBaseItem("RawOrbTier3", ModTabList.ModThaumcraftTab)),
    RawOrbTier4(new ModSimpleBaseItem("RawOrbTier4", ModTabList.ModThaumcraftTab)),
    RawOrbTier5(new ModSimpleBaseItem("RawOrbTier5", ModTabList.ModThaumcraftTab)),
    RawOrbTier6(new ModSimpleBaseItem("RawOrbTier6", ModTabList.ModThaumcraftTab)),
    RawSDHCAlloy(new ModSimpleBaseItem("RawSDHCAlloy", ModTabList.ModSpaceTab)),
    RedstoneAlloyBars(new ModSimpleBaseItem("RedstoneAlloyBars", ModTabList.ModBarsAndCasingsTab)),
    ReinforcedGlassPlate(new ModSimpleBaseItem("ReinforcedGlassPlate", ModTabList.ModGenericTab)),
    ReinforcedGlassLense(new ModSimpleBaseItem("ReinforcedGlassLense", ModTabList.ModGenericTab)),
    ReinforcedIridiumDrillTip(new ModSimpleBaseItem("ReinforcedIridiumDrillTip", ModTabList.ModGenericTab)),
    ReinforcedAluminiumIronPlate(new ModSimpleBaseItem("ReinforcedAluminiumIronPlate", ModTabList.ModSolarTab)),
    ReinforcedChromeIronPlate(new ModSimpleBaseItem("ReinforcedChromeIronPlate", ModTabList.ModSolarTab)),
    ReinforcedNaquadriaIronPlate(new ModSimpleBaseItem("ReinforcedNaquadriaIronPlate", ModTabList.ModSolarTab)),
    ReinforcedNeutroniumIronPlate(new ModSimpleBaseItem("ReinforcedNeutroniumIronPlate", ModTabList.ModSolarTab)),
    ReinforcedTitaniumIronPlate(new ModSimpleBaseItem("ReinforcedTitaniumIronPlate", ModTabList.ModSolarTab)),
    ReinforcedTungstenIronPlate(new ModSimpleBaseItem("ReinforcedTungstenIronPlate", ModTabList.ModSolarTab)),
    ReinforcedTungstenSteelIronPlate(new ModSimpleBaseItem("ReinforcedTungstenSteelIronPlate", ModTabList.ModSolarTab)),
    SandStoneRod(new ModSimpleBaseItem("SandStoneRod", ModTabList.ModGenericTab)),
    SawBladeStone(new ModSimpleBaseItem("SawBladeStone", ModTabList.ModGenericTab)),
    SawBladeDiamond(new ModSimpleBaseItem("SawBladeDiamond", ModTabList.ModGenericTab)),
    SawBladeArdite(new ModSimpleBaseItem("SawBladeArdite", ModTabList.ModGenericTab)),
    SawBladeManyullyn(new ModSimpleBaseItem("SawBladeManyullyn", ModTabList.ModGenericTab)),
    SawBladeRuby(new ModSimpleBaseItem("SawBladeRuby", ModTabList.ModGenericTab)),
    SawBladeSapphire(new ModSimpleBaseItem("SawBladeSapphire", ModTabList.ModGenericTab)),
    SawBladePeridot(new ModSimpleBaseItem("SawBladePeridot", ModTabList.ModGenericTab)),
    SchematicsAstroMiner(new ModSimpleBaseItem("SchematicsAstroMiner", ModTabList.ModSpaceTab)),
    SchematicsCargoRocket(new ModSimpleBaseItem("SchematicsCargoRocket", ModTabList.ModSpaceTab)),
    SchematicsMoonBuggy(new ModSimpleBaseItem("SchematicsMoonBuggy", ModTabList.ModSpaceTab)),
    SchematicsTier1(new ModSimpleBaseItem("SchematicsTier1", ModTabList.ModSpaceTab)),
    SchematicsTier2(new ModSimpleBaseItem("SchematicsTier2", ModTabList.ModSpaceTab)),
    SchematicsTier3(new ModSimpleBaseItem("SchematicsTier3", ModTabList.ModSpaceTab)),
    SchematicsTier4(new ModSimpleBaseItem("SchematicsTier4", ModTabList.ModSpaceTab)),
    SchematicsTier5(new ModSimpleBaseItem("SchematicsTier5", ModTabList.ModSpaceTab)),
    SchematicsTier6(new ModSimpleBaseItem("SchematicsTier6", ModTabList.ModSpaceTab)),
    SchematicsTier7(new ModSimpleBaseItem("SchematicsTier7", ModTabList.ModSpaceTab)),
    SchematicsTier8(new ModSimpleBaseItem("SchematicsTier8", ModTabList.ModSpaceTab)),
    ShapeAxeHead(new ModSimpleBaseItem("ShapeAxeHead", ModTabList.ModShapesTab)),
    ShapeBlock(new ModSimpleBaseItem("ShapeBlock", ModTabList.ModShapesTab)),
    ShapeBoat(new ModSimpleBaseItem("ShapeBoat", ModTabList.ModShapesTab)),
    ShapeBolt(new ModSimpleBaseItem("ShapeBolt", ModTabList.ModShapesTab)),
    ShapeBottle(new ModSimpleBaseItem("ShapeBottle", ModTabList.ModShapesTab)),
    ShapeCasing(new ModSimpleBaseItem("ShapeCasing", ModTabList.ModShapesTab)),
    ShapeCell(new ModSimpleBaseItem("ShapeCell", ModTabList.ModShapesTab)),
    ShapeFileHead(new ModSimpleBaseItem("ShapeFileHead", ModTabList.ModShapesTab)),
    ShapeGear(new ModSimpleBaseItem("ShapeGear", ModTabList.ModShapesTab)),
    ShapeHammerHead(new ModSimpleBaseItem("ShapeHammerHead", ModTabList.ModShapesTab)),
    ShapeHoeHead(new ModSimpleBaseItem("ShapeHoeHead", ModTabList.ModShapesTab)),
    ShapeHugePipe(new ModSimpleBaseItem("ShapeHugePipe", ModTabList.ModShapesTab)),
    ShapeIngot(new ModSimpleBaseItem("ShapeIngot", ModTabList.ModShapesTab)),
    ShapeLargePipe(new ModSimpleBaseItem("ShapeLargePipe", ModTabList.ModShapesTab)),
    ShapeNormalPipe(new ModSimpleBaseItem("ShapeNormalPipe", ModTabList.ModShapesTab)),
    ShapePickaxeHead(new ModSimpleBaseItem("ShapePickaxeHead", ModTabList.ModShapesTab)),
    ShapePlate(new ModSimpleBaseItem("ShapePlate", ModTabList.ModShapesTab)),
    ShapeRing(new ModSimpleBaseItem("ShapeRing", ModTabList.ModShapesTab)),
    ShapeRod(new ModSimpleBaseItem("ShapeRod", ModTabList.ModShapesTab)),
    ShapeSawBlade(new ModSimpleBaseItem("ShapeSawBlade", ModTabList.ModShapesTab)),
    ShapeShovelHead(new ModSimpleBaseItem("ShapeShovelHead", ModTabList.ModShapesTab)),
    ShapeSmallPipe(new ModSimpleBaseItem("ShapeSmallPipe", ModTabList.ModShapesTab)),
    ShapeSwordBlade(new ModSimpleBaseItem("ShapeSwordBlade", ModTabList.ModShapesTab)),
    ShapeTinyPipe(new ModSimpleBaseItem("ShapeTinyPipe", ModTabList.ModShapesTab)),
    ShapeWire(new ModSimpleBaseItem("ShapeWire", ModTabList.ModShapesTab)),
    SimpleCircuitBoard(new ModSimpleBaseItem("SimpleCircuitBoard", ModTabList.ModCircuitsTab)),
    SnowQueenBlood(new ModSimpleBaseItem("SnowQueenBlood", ModTabList.ModThaumcraftTab)),
    SnowQueenBloodDrop(new ModSimpleBaseItem("SnowQueenBloodDrop", ModTabList.ModThaumcraftTab)),
    SoulariumBars(new ModSimpleBaseItem("SoulariumBars", ModTabList.ModBarsAndCasingsTab)),
    StainlessSteelBars(new ModSimpleBaseItem("StainlessSteelBars", ModTabList.ModBarsAndCasingsTab)),
    StainlessSteelItemCasing(new ModSimpleBaseItem("StainlessSteelItemCasing", ModTabList.ModBarsAndCasingsTab)),
    SteelBars(new ModSimpleBaseItem("SteelBars", ModTabList.ModBarsAndCasingsTab)),
    SteelDualCompressedPlates(new ModSimpleBaseItem("SteelDualCompressedPlates", ModTabList.ModSpaceTab)),
    StonePlate(new ModSimpleBaseItem("StonePlate", ModTabList.ModGenericTab)),
    TeleposerFrame(new ModSimpleBaseItem("TeleposerFrame", ModTabList.ModThaumcraftTab)),
    Tier2Booster(new ModSimpleBaseItem("Tier2Booster", ModTabList.ModSpaceTab)),
    Tier3Booster(new ModSimpleBaseItem("Tier3Booster", ModTabList.ModSpaceTab)),
    Tier4Booster(new ModSimpleBaseItem("Tier4Booster", ModTabList.ModSpaceTab)),
    TinDualCompressedPlates(new ModSimpleBaseItem("TinDualCompressedPlates", ModTabList.ModSpaceTab)),
    TitaniumBars(new ModSimpleBaseItem("TitaniumBars", ModTabList.ModBarsAndCasingsTab)),
    TitaniumDualCompressedPlates(new ModSimpleBaseItem("TitaniumDualCompressedPlates", ModTabList.ModSpaceTab)),
    TitaniumItemCasing(new ModSimpleBaseItem("TitaniumItemCasing", ModTabList.ModBarsAndCasingsTab)),
    TitaniumIronPlate(new ModSimpleBaseItem("TitaniumIronPlate", ModTabList.ModSolarTab)),
    TitanStoneDust(new ModSimpleBaseItem("TitanStoneDust", ModTabList.ModSpaceTab)),
    TranscendentOrb(new ModSimpleBaseItem("TranscendentOrb", ModTabList.ModThaumcraftTab)),
    TritonStoneDust(new ModSimpleBaseItem("TritonStoneDust", ModTabList.ModSpaceTab)),
    TungstenBars(new ModSimpleBaseItem("TungstenBars", ModTabList.ModBarsAndCasingsTab)),
    TungstenItemCasing(new ModSimpleBaseItem("TungstenItemCasing", ModTabList.ModBarsAndCasingsTab)),
    TungstenIronPlate(new ModSimpleBaseItem("TungstenIronPlate", ModTabList.ModSolarTab)),
    TungstenSteelBars(new ModSimpleBaseItem("TungstenSteelBars", ModTabList.ModBarsAndCasingsTab)),
    TungstenSteelItemCasing(new ModSimpleBaseItem("TungstenSteelItemCasing", ModTabList.ModBarsAndCasingsTab)),
    TungstenSteeLIronPlate(new ModSimpleBaseItem("TungstenSteelIronPlate", ModTabList.ModSolarTab)),
    TungstenString(new ModSimpleBaseItem("TungstenString", ModTabList.ModSpaceTab)),
    UncookedSlush(new ModSimpleBaseItem("UncookedSlush", ModTabList.ModThaumcraftTab)),
    UnfiredClayBrick(new ModSimpleBaseItem("UnfiredClayBrick", ModTabList.ModGenericTab)),
    UnfiredCokeOvenBrick(new ModSimpleBaseItem("UnfiredCokeOvenBrick", ModTabList.ModGenericTab)),
    UnfiredSearedBrick(new ModSimpleBaseItem("UnfiredSearedBrick", ModTabList.ModGenericTab)),
    UnfiredSlimeSoulBrick(new ModSimpleBaseItem("UnfiredSlimeSoulBrick", ModTabList.ModGenericTab)),
    VegaBStoneDust(new ModSimpleBaseItem("VegaBStoneDust", ModTabList.ModSpaceTab)),
    VenusStoneDust(new ModSimpleBaseItem("VenusStoneDust", ModTabList.ModSpaceTab)),
    VibrantAlloyBars(new ModSimpleBaseItem("VibrantAlloyBars", ModTabList.ModBarsAndCasingsTab)),
    VoidFoil(new ModSimpleBaseItem("VoidFoil", ModTabList.ModThaumcraftTab)),
    VoidPlate(new ModSimpleBaseItem("VoidPlate", ModTabList.ModThaumcraftTab)),
    VoidRing(new ModSimpleBaseItem("VoidRing", ModTabList.ModThaumcraftTab)),
    VoidRod(new ModSimpleBaseItem("VoidRod", ModTabList.ModThaumcraftTab)),
    WandCapAlchemical(new ModSimpleBaseItem("WandCapAlchemical", ModTabList.ModThaumcraftTab)),
    WandCapBloodIron(new ModSimpleBaseItem("WandCapBloodIron", ModTabList.ModThaumcraftTab)),
    WeakOrb(new ModSimpleBaseItem("WeakOrb", ModTabList.ModThaumcraftTab)),
    WetTofu(new ModSimpleBaseItem("WetTofu", ModTabList.ModGenericTab)),
    WirelessTransmitter(new ModSimpleBaseItem("WirelessTransmitter", ModTabList.ModGenericTab)),
    WoodenBrickForm(new ModSimpleBaseItem("WoodenBrickForm", ModTabList.ModGenericTab)),
    WoodenCasing(new ModSimpleBaseItem("WoodenCasing", ModTabList.ModGenericTab)),

    // Do not delete this
    EndOfList(null);

    // ################################################################################
    public ModSimpleBaseItem Item;

    private ItemList(ModSimpleBaseItem pItem)
    {
        Item = pItem;
        if (Item != null) Item.setModIDName(Refstrings.MODID);
    }

    public static boolean AddToItemManager(ModItemManager pItemManager)
    {
        boolean tResult = true;
        for (ItemList il : ItemList.values())
        {
            if (il.Item != null) if (!pItemManager.AddItemToManagedRegistry(il.Item))
            {
                MainRegistry.Logger.error(String.format("Item [%s] failed to register", il.toString()));
                tResult = false;
            }
        }

        return tResult;
    }

    public ItemStack getIS()
    {
        return new ItemStack(Item.getConstructedItem(), 1);
    }

}

package com.disrupt.conservo;

import android.app.Activity;
import android.os.Bundle;

/**
 *  @author Skylar Castator
 */
public class WordDefinitions extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        //Terms
        String m_CoolingTonHours = "Cooling Ton Hours";
        String PeakTons = "Peak Tons";
        String m_CoefficientofPerformance = "Coefficient of Performance (COP)";
        String m_EquivalentFullLoadHours = "Equivalent Full Load Hours (EFLH)";
        String m_FreeAirCooling = "Free-air cooling";
        String m_CoolingTower = "Cooling Tower";
        String Chiller = "Chiller";
        String m_CyclesofConcentration = "Cycles of Concentration";
        String m_Blowdown = "Blowdown";
        String m_MakeUpWater = "Make Up Water";
        String m_EvaporativeCooling = "Evaporative Cooling";
        String m_AirEconomizer = "Air Economizer";
        String m_TraditionalChemistry = "Traditional Chemistry";
        String m_WaterSoftener = "Water Softener";
        String m_SewerCredit = "Sewer Credit";
        
        //Definitions
        String m_CoolingTonHours_Def = "Cooling Ton Hours capture heat removed from a  building over time, similar to kilowatt-hours. Cooling ton hours will reflect changes to cooling load from the weather, season as well as significant changes to equipment, “skin load” (i.e., changes in the number of people), or changes to the building.";
        String PeakTons_Def = "Cooling tons provided by the chiller on the “hottest hour of the hottest day of the year” for a site. This IS NOT the same as capacity since sites are designed to have additional back up capacity in case one of the chillers breaks down. Peak tons is not static for a site, but can change in response to major changes to the building, i.e., equipment changes.";
        String m_CoefficientofPerformance_Def = "Coefficient of Performance (COP)  is the basic parameter used to report efficiency of refrigerant based systems. COP is defined as the ratio of of heat removal to energy input to the compressor. With the COP of the chiller(s), we can calculate energy used if we know cooling ton hours  based on the formula kW/ton=3.516/COP.";
        String m_EquivalentFullLoadHours_Def = "Equivalent Full Load Hours (EFLH)/year- The EFLH is the number of hours that the chiller(s) have to run at Full Load (or Peak Tons) over the course of a year to provide sufficient cooling to a building. The EFLH is calculated using site-specific National Oceanic and Atmospheric Administration (NOAA) weather data and a “cooling profile” for a site that takes into consideration the type of site (data center versus office building) and the potential impact of free air cooling (from air-side and water-side economizers).";
        String m_FreeAirCooling_Def = "Use cooler outside air to reduce the need to run the chiller to deliver to the building.  Since running the chiller uses  energy and water, reducing the need to run the chiller can drive significant savings.";
        String m_CoolingTower_Def = "Cooling towers reject waste heat to the atmosphere by evaporative and sensible heat transfer.";
        String Chiller_Def = "Chillers are machine used to remove heat from buildings.";
        String m_CyclesofConcentration_Def = "The concentration ratio between the makeup and the blowdown. Cycles of concentration (COC) is the primary indicator of cooling tower efficiency, with regard to water conservation.";
        String m_Blowdown_Def = "Blowdown (or bleed) is the concentrated (with mineral salts and other solids) cooling water discharged to the sewer.";
        String m_MakeUpWater_Def = "The water that needs to be added back to the cooling tower water loop to replace  water lost through evaporative cooling and “blowdown” the sewer.";
        String m_EvaporativeCooling_Def = "Evaporative cooling is the same cooling process your body uses, i.e., as the perspiration on evaporates, it pulls heat away from your body.";
        String m_AirEconomizer_Def = "An air-side economizer brings outside air into a building and distributes it through the centrail air handling system. Equipment that enables Free Air Cooling";
        String m_TraditionalChemistry_Def = "A typical water treatment program that adds chemicals to the cooling water in order to inhibit scale, corrosion and microbiological growth";
        String m_WaterSoftener_Def = "Equipment that removes calcium, magnesium and certain other metal cations in hard water.  The presence of these metal ions can lead to fouling from scale buildup";
        String m_SewerCredit_Def = "Some municipal water providers will charge for the supply of water but also add a sewer charge for the same volume of water supplied, assuming that the water is discharged through the sewer.  Since cooling towers evaporate most of the water supplied, a credit is sometimes applied for the water evaporated.";
        
        
        
        
    }
}
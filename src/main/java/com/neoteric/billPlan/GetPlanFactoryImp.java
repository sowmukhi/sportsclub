package com.neoteric.billPlan;

public class GetPlanFactoryImp implements GetPlanFactory{
    @Override
    public Plan getPlan(String planType) {
        Plan plan =null;
        if("Domestic".equalsIgnoreCase(planType)){
            plan = new DomesticPlan();
        }
        return null;
    }
}

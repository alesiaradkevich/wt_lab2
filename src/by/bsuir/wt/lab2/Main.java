package by.bsuir.wt.lab2;


import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;
import by.bsuir.wt.lab2.entity.criteria.SearchCriteria;
import by.bsuir.wt.lab2.service.IService;
import by.bsuir.wt.lab2.service.ServiceFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static by.bsuir.wt.lab2.entity.criteria.SearchCriteria.*;

public class Main {

    public static void main(String[] args) {
        IService service = ServiceFactory.getInstance().getApplianceService();
        List<Appliance> list = new ArrayList<Appliance>();

        Criteria kettleCriteria = new Criteria(SearchCriteria.Kettle.class.getSimpleName());
        List<Appliance> kettles = service.find(kettleCriteria);
        list.addAll(kettles);
        if (kettles != null) {
            List<Appliance> kettlesOrderedByName = service.sort(Comparator.comparing(Appliance::getName), kettles);
            System.out.println("\nAll kettles: ");
            PrintApplianceInfo.print(kettlesOrderedByName);
        }

        Criteria laptopCriteria = new Criteria(SearchCriteria.Laptop.class.getSimpleName());
        List<Appliance> laptops = service.find(laptopCriteria);
        list.addAll(laptops);

        Criteria refrigeratorCriteria = new Criteria(SearchCriteria.Refrigerator.class.getSimpleName());
        List<Appliance> refrigerators = service.find(refrigeratorCriteria);
        list.addAll(refrigerators);

        Criteria vcCriteria = new Criteria(SearchCriteria.VacuumCleaner.class.getSimpleName());
        List<Appliance> vcs = service.find(vcCriteria);
        list.addAll(vcs);

        List<Appliance> minPriceAppliances = service.getMin(Comparator.comparing(Appliance::getPrice), list);
        if (minPriceAppliances != null) {
            System.out.println("\nThe cheapest device: ");
            PrintApplianceInfo.print(minPriceAppliances);
        }

        List<Appliance> maxPriceAppliances = service.getMax(Comparator.comparing(Appliance::getPrice), list);
        if (maxPriceAppliances != null) {
            System.out.println("\nThe most expensive device: ");
            PrintApplianceInfo.print(maxPriceAppliances);
        }

    }
}


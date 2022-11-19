package by.bsuir.wt.lab2.service;

import by.bsuir.wt.lab2.entity.Appliance;
import by.bsuir.wt.lab2.entity.criteria.Criteria;

import java.util.Comparator;
import java.util.List;

public interface IService {
    List<Appliance> find(Criteria criteria);

    List<Appliance> sort(Comparator<Appliance> comparator, List<Appliance> appliances);

    List<Appliance> sort(Comparator<Appliance> comparator);

    List<Appliance> getMin(Comparator<Appliance> comparator, List<Appliance> appliances);

    List<Appliance> getMin(Comparator<Appliance> comparator);

    List<Appliance> getMax(Comparator<Appliance> comparator, List<Appliance> appliances);

    List<Appliance> getMax(Comparator<Appliance> comparator);

    void save(List<Appliance> appliances);

}
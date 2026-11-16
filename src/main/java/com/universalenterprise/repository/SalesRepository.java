
package com.universalenterprise.repository;

import com.universalenterprise.model.Sale;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SalesRepository {

    private final List<Sale> sales = new ArrayList<>();


    public void save(Sale sale) {
        sales.add(sale);
    }

    public List<Sale> findAll() {
        return new ArrayList<>(sales);
    }


    public Optional<Sale> findById(Long id) {
        return sales.stream()
                .filter(sale -> Objects.equals(sale.getId(), id))
                .findFirst();
    }

    public boolean update(Sale updatedSale) {

        for (int i = 0; i < sales.size(); i++) {

            if (Objects.equals(sales.get(i).getId(), updatedSale.getId())) {

                sales.set(i, updatedSale);
                return true;
            }
        }

        return false;
    }


    public boolean deleteById(Long id) {
        return sales.removeIf(
                sale -> Objects.equals(sale.getId(), id)
        );
    }
}


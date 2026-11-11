package com.universalenterprise.repository;

import com.universalenterprise.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CategoryRepository {

   private final List<Category> categories = new ArrayList<>();

   public void save(Category category){
       categories.add(category);
   }

   public List<Category>findALL(){
       return new ArrayList<>(categories);
   }

   public Category findById(Long id){
       return categories.stream()
               .filter(category -> category.getId().equals(id))
               .findFirst()
               .orElse(null);

   }
   
}

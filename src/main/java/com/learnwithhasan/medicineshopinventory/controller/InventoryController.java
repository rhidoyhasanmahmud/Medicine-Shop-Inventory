package com.learnwithhasan.medicineshopinventory.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnwithhasan.medicineshopinventory.dto.request.ProductCreateRequest;
import com.learnwithhasan.medicineshopinventory.service.InventoryService;

import lombok.RequiredArgsConstructor;

/*************************************************************************
 * {@link Inventory} Controller
 * 
 * @author Hasan Mahmud
 * @since 2021-01-03
 *************************************************************************/
@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@CrossOrigin(origins = "*", maxAge = 3600)
public class InventoryController {
	
	private final InventoryService service;
	
	@GetMapping("/admin/inventory/list")
    public String showProductInventoryList(Model model, Pageable pageable) {
        model.addAttribute("products", service.listByPage(pageable));
        return "admin/productListPage";
    }

    @GetMapping("/admin/inventory")
    public String showCreateProductForm(Model model) {
        model.addAttribute("productCreateRequest", new ProductCreateRequest());
        return "admin/addProductPage";
    }

    @PostMapping("/admin/inventory")
    public String createProduct(@ModelAttribute @Valid ProductCreateRequest productCreateRequest,
                                BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "admin/addProductPage";
        }

        service.create(productCreateRequest);
        return "redirect:/admin/inventory/list";
    }

}

package com.learnwithhasan.medicineshopinventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

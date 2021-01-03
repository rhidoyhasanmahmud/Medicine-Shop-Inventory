package com.learnwithhasan.medicineshopinventory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*************************************************************************
 * {@link InventoryService} implementation class
 * 
 * @author Hasan Mahmud
 * @since 2021-01-03
 *************************************************************************/
@Service
@Transactional
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class InventoryServiceImpl implements InventoryService {

}

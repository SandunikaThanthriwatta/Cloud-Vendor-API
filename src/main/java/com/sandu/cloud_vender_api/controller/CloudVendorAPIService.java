package com.sandu.cloud_vender_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandu.cloud_vender_api.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){

        return new CloudVendor("c1","name1","address1","xxxx");

    }
}

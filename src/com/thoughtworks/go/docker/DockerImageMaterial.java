package com.thoughtworks.go.docker;

import com.thoughtworks.go.plugin.api.annotation.Extension;
import com.thoughtworks.go.plugin.api.material.packagerepository.PackageMaterialConfiguration;
import com.thoughtworks.go.plugin.api.material.packagerepository.PackageMaterialPoller;
import com.thoughtworks.go.plugin.api.material.packagerepository.PackageMaterialProvider;

@Extension
public class DockerImageMaterial implements PackageMaterialProvider {
    @Override
    public PackageMaterialConfiguration getConfig() {
        return new DockerMaterialConfiguration();
    }

    @Override
    public PackageMaterialPoller getPoller() {
        return new DockerMaterialPoller();
    }
}

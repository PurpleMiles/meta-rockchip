# Copyright (C) 2017 Fuzhou Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = " \
	git://github.com/rockchip-linux/linux.git;branch=4.14-rc2; \
"

SRCREV = "d0aa0caae3e8912950af89e6e1579ab319ee8a3d"
LINUX_VERSION = "4.14.0"

# Override local version in order to use the one generated by linux build system
# And not "yocto-standard"
LINUX_VERSION_EXTENSION = ""
PR = "r2"
PV = "${LINUX_VERSION}"

# Include only supported boards for now
COMPATIBLE_MACHINE = "(rk3036|rk3066|rk3288|rk3328|rk3399)"
deltask kernel_configme

KERNEL_DEVICETREE_excavator-rk3399 = "rockchip/rk3399-sapphire-excavator.dtb"
KERNEL_DEVICETREE_firefly-rk3399 = "rockchip/rk3399-firefly.dtb"
KERNEL_DEVICETREE_tinker-rk3288 =  "rk3288-tinker.dtb"

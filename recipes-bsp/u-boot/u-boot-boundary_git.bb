require recipes-bsp/u-boot/u-boot.inc

DESCRIPTION = "u-boot for Boundary Devices boards."
LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"
COMPATIBLE_MACHINE = "(imx6qsabrelite|nitrogen6x|nitrogen6sx|nitrogen7)"

PROVIDES = "u-boot"

PV = "v2016.03+git${SRCPV}"

SRCREV = "d4aa4cce1f7fbd5df8e2cac72996826a8a096dac"
SRCBRANCH = "boundary-v2016.03"
SRC_URI = "git://github.com/boundarydevices/u-boot-imx6.git;branch=${SRCBRANCH}"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

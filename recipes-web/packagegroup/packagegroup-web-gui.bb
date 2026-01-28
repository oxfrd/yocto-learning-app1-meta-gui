# packagegroup-web-gui.bb
SUMMARY = "Complete Web GUI Stack"
LICENSE = "MIT"
PR = "1.0"
inherit packagegroup

RDEPENDS:${PN}:append = " \
    gpio-permissions \
    start-script \
    web-toggle \
    bash \
    libgpiod-tools \
    cog \
    wpewebkit \
    apache2 \    
"
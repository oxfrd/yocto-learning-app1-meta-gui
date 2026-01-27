SUMMARY = "Add rules for GPIO access"
DESCRIPTION = "Installs udev rules for GPIO access."
LICENSE = "CLOSED"

SRC_URI = "file://99-gpio.rules"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${sysconfdir}/udev/rules.d/
    install -m 0644 ${S}/99-gpio.rules ${D}${sysconfdir}/udev/rules.d/99-gpio.rules
}

FILES:${PN} += "${sysconfdir}/udev/rules.d/99-gpio.rules"

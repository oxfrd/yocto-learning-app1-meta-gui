DESCRIPTION = "A simple web interface to toggle an LED connected to a GPIO pin"
LICENSE = "CLOSED"

SRC_URI = "file://led-toggle.sh"
SRC_URI += "file://index.html"

RDEPENDS:${PN} += "bash"

do_install() {
    install -d ${D}${libdir}/cgi-bin
    install -m 0755 ${WORKDIR}/led-toggle.sh ${D}${libdir}/cgi-bin/led-toggle.sh

    install -d ${D}${localstatedir}/www/html
    install -m 0755 ${WORKDIR}/index.html ${D}${localstatedir}/www/html/index.html
}

FILES:${PN} += "${libdir}/cgi-bin/led-toggle.sh \
                ${localstatedir}/www/html/index.html"
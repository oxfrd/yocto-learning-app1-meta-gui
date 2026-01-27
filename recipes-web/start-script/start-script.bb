SUMMARY = "Adds a startup script for the Cog browser"
DESCRIPTION = "Installs an executable script to /usr/bin/start-script to launch Cog in fullscreen mode."
LICENSE = "CLOSED"

RDEPENDS:${PN} += "bash"

SRC_URI = "file://start-script"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}

    install -m 0755 ${S}/start-script ${D}${bindir}/start-script
}

FILES:${PN} += "${bindir}/start-script"

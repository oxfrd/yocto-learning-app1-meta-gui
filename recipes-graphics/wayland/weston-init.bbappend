FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

do_install:append:rpi() {
    sed -i '$a\\n[launcher]\npath=/usr/bin/start-script' ${D}/${sysconfdir}/xdg/weston/weston.ini
    sed -i '$a\\n[autolaunch]\npath=/usr/bin/start-script' ${D}/${sysconfdir}/xdg/weston/weston.ini
    sed -i '/^\[core\]/,/^\[/s/^#*shell=.*\.so/shell=kiosk-shell.so/' ${D}/${sysconfdir}/xdg/weston/weston.ini
}
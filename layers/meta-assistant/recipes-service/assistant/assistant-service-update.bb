inherit systemd
SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "assistant-update.service"

SRC_URI_append = " file://assistant-update.service "
FILES_${PN} += "${systemd_unitdir}/system/assistant-update.service"

do_install_append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/assistant-update.service ${D}/${systemd_unitdir}/system
}

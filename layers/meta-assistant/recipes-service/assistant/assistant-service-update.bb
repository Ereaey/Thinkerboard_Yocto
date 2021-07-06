DESCRIPTION = "Add service auto update assistant"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
	file://LICENSE;md5=efab06594070f714e6e655a25c330fcd \
"


inherit systemd
SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE_${PN} = "assistant-update.service"

SRC_URI_append = " file://assistant-update.service "
FILES_${PN} += "${systemd_unitdir}/system/assistant-update.service"

do_install_append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/assistant-update.service ${D}/${systemd_unitdir}/system
}

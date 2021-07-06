DESCRIPTION = "Add default user"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "\
	file://LICENSE;md5=efab06594070f714e6e655a25c330fcd \
"



INHERIT += "extrausers"

EXTRA_USERS_PARAMS = "useradd -P assistant-ps assistant;"
EXTRA_USERS_PARAMS += "usermod  -P linux  root;" 

require u-boot.inc

DEPENDS += "dtc-native"

# This revision corresponds to the tag "v2015.07"
# We use the revision in order to avoid having to fetch it from the
# repo during parse
SRCREV = "33711bdd4a4dce942fb5ae85a68899a8357bdd94"

PV = "v2015.07+git${SRCPV}"

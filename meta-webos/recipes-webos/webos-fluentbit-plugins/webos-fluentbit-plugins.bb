# Copyright (c) 2021 LG Electronics, Inc.

SUMMARY = "webOS fluentbit plugins"
AUTHOR = "Sangwoo Kang <sangwoo82.kang@lge.com>"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10 \
                    file://oss-pkg-info.yaml;md5=2bdfe040dcf81b4038370ae96036c519 \
"

DEPENDS = "glib-2.0 luna-service2 json-c libpbnjson fluentbit"
RDEPENDS_${PN} = "python3-core python3-requests python3-atlassian-python-api"

WEBOS_VERSION = "1.0.0-8_54a310c2fcdc6834aca19ae69b7b014a1a6137cd"
PR = "r1"

inherit webos_component
inherit webos_enhanced_submissions
inherit webos_pkgconfig
inherit webos_cmake
inherit webos_system_bus
inherit webos_public_repo
inherit webos_machine_dep
inherit webos_distro_dep
inherit webos_distro_variant_dep

SRC_URI="${WEBOSOSE_GIT_REPO_COMPLETE}"

S = "${WORKDIR}/git"

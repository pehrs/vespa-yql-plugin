#!/usr/bin/env bash
set -e

SAMPLE_APP_ROOT=$(dirname $0)/..

# Generate certificate chain for Vespa and copy host certificate
# with root certificate to directory mounted to Vespa Docker containers
${SAMPLE_APP_ROOT}/scripts/generate-vespa-cert-chain.sh
cp ${SAMPLE_APP_ROOT}/pki/vespa/ca-vespa.pem ${SAMPLE_APP_ROOT}/tls/
cp ${SAMPLE_APP_ROOT}/pki/vespa/host.pem ${SAMPLE_APP_ROOT}/tls/
cp ${SAMPLE_APP_ROOT}/pki/vespa/host.key ${SAMPLE_APP_ROOT}/tls/


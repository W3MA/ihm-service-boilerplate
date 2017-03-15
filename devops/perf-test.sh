#!/usr/bin/env bash

ROOT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && cd .. && pwd )"
cd ${ROOT_DIR}

./gradlew gatlingRun \
	-PartifactName=$ARTIFACT_NAME \
	-PappVersion=$VERSION \
	-PdockerfileDir=$DOCKERFILE

if [[ $? -ne 0 ]] ; then
   	echo "error in running perf test."
	exit 1
fi
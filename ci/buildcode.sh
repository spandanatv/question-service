#!/bin/sh
cd question-service
gradle clean assemble
cp build/libs/*.jar ../artifacts/

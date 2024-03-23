#!/bin/bash

echo "======= Started verify step ======="

cd "3-platform/"

for dir in */; do
  echo "Verifying the $dir"
  cd $dir
  mvn spotless:check
  cd ..
  done

cd ..
echo "======= Verify step is finished ======="
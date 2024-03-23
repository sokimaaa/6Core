#!/bin/bash

echo "======= Started library traversing ======="
cd "2-library/"

directories=$(find . -mindepth 1 -maxdepth 1 -type d)

for dir in $directories; do
  echo "Building the $dir"

  if [ -e "$dir/pom.xml" ]; then
    echo "Building the library..."
    cd "$dir" && mvn -B clean install && cd ..
  else
    echo "Building of current library is skipped due missing pom.xml."
  fi

  done

cd ..
echo "======= Library building is finished ======="
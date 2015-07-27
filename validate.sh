#! /bin/bash

files[0]=./validation/basic.xml
files[1]=./validation/simple-action-bar.xml
files[2]=./validation/action-bar-items.xml
files[3]=./validation/action-bar-nav-button.xml
xmllint --schema schema.xsd ${files[*]}


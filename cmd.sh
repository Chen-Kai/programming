for f in `ls | grep -v '[.]'`; do
	mv $f ${f}.md
done

for f in `ls | grep -v '[.]'`; do
	if [ -f f ]; then 
		mv $f ${f}.md
	fi
done

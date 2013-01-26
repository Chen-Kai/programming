for f in `ls`; do
	if [ -d $f ]; then
		echo `du -sh $f/`
	elif [ -f $f ]; then
		echo `du -sh $f`
	fi
done

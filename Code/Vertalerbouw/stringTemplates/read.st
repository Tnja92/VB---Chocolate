.line $lnr$
$if(rest(ids))$
$ids: {$it$
pop}$
$else$
$first(ids)$
$endif$

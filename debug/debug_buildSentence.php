<?php

$URL = "http://localhost:8080/nlg";

class Request {
    public $subjects;
    public $verbs;
    public $objects;
}

$debugRequest = new Request();
$debugRequest->subjects = array("This test");
$debugRequest->verbs = array("work");
$debugRequest->objects = array();

$ch = curl_init();
curl_setopt($ch, CURLOPT_URL, $URL);
curl_setopt($ch, CURLOPT_HTTPHEADER, array('Content-Type: application/json', 'Accept: application/json'));
curl_setopt($ch, CURLOPT_POST, 1);
curl_setopt($ch, CURLOPT_POSTFIELDS, json_encode($debugRequest));
curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
curl_setopt($ch, CURLOPT_USERPWD, "username:password");
curl_setopt($ch, CURLOPT_SSL_VERIFYPEER, false);
curl_setopt($ch, CURLOPT_SSL_VERIFYHOST, 0);
curl_setopt($ch, CURLOPT_FOLLOWLOCATION, TRUE);
curl_setopt($ch, CURLOPT_VERBOSE, TRUE);
// curl_setopt($ch, CURLOPT_USERAGENT, $this->_agent);
// curl_setopt($ch, CURLOPT_COOKIEFILE, $this->_cookie_file_path);
// curl_setopt($ch, CURLOPT_COOKIEJAR, $this->_cookie_file_path);

$result = curl_exec($ch);
if (curl_errno($ch)) {
  print curl_error($ch);
} else {
  curl_close($ch);
}

echo  $result;

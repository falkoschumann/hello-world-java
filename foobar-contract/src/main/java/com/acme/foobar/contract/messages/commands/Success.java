/*
 * Foobar - Contract
 * Copyright (c) 2021 ACME Ltd. <contact@acme.com>
 */

package com.acme.foobar.contract.messages.commands;

import lombok.Value;

@Value
public class Success implements CommandStatus {}
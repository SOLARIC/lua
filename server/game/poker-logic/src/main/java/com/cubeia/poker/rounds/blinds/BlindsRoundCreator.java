/**
 * Copyright (C) 2012 Cubeia Ltd <info@cubeia.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.cubeia.poker.rounds.blinds;

import com.cubeia.poker.adapter.ServerAdapterHolder;
import com.cubeia.poker.blinds.BlindsCalculator;
import com.cubeia.poker.context.PokerContext;
import com.cubeia.poker.rounds.Round;
import com.cubeia.poker.rounds.RoundCreator;
import com.cubeia.poker.variant.texasholdem.NonRandomSeatProvider;

import java.io.Serializable;

public class BlindsRoundCreator implements RoundCreator, Serializable {

    @Override
    public Round create(PokerContext context, ServerAdapterHolder serverAdapterHolder) {
        return new BlindsRound(context, serverAdapterHolder, new BlindsCalculator(new NonRandomSeatProvider()));
    }
}
